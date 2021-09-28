package org.elixir_lang.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiPolyVariantReference
import com.intellij.psi.ResolveState
import org.elixir_lang.psi.CallDefinitionClause.nameArityInterval
import org.elixir_lang.psi.call.Call
import org.elixir_lang.psi.call.name.Function.*
import org.elixir_lang.psi.call.name.Module.KERNEL
import org.elixir_lang.psi.impl.call.finalArguments
import org.elixir_lang.psi.impl.call.macroChildCallSequence
import org.elixir_lang.psi.impl.call.stabBodyChildExpressions
import org.elixir_lang.psi.impl.maybeModularNameToModulars
import org.elixir_lang.psi.impl.stripAccessExpression

object Using {
    fun treeWalkUp(usingCall: Call, useCall: Call?, resolveState: ResolveState, keepProcessing: (PsiElement, ResolveState) -> Boolean): Boolean =
            usingCall
                    .stabBodyChildExpressions(forward = false)
                    ?.filterIsInstance<Call>()
                    // Because `forward = false`, `firstOrNull` gets the last Call in the `do` block
                    ?.firstOrNull()
                    ?.takeUnlessHasBeenVisited(resolveState)
                    ?.let { lastChildCall -> treeWalkUpFromLastChildCall(lastChildCall, useCall, resolveState, keepProcessing) }
                    ?:
                    true

    private fun treeWalkUpFromLastChildCall(lastChildCall: Call, useCall: Call?, resolveState: ResolveState, keepProcessing: (PsiElement, ResolveState) -> Boolean): Boolean {
        val resolvedModuleName = lastChildCall.resolvedModuleName()
        val functionName = lastChildCall.functionName()

        return if (resolvedModuleName != null && functionName != null) {
            when {
                resolvedModuleName == KERNEL && functionName == QUOTE -> {
                    QuoteMacro.treeWalkUp(lastChildCall, resolveState, keepProcessing)
                }

                resolvedModuleName == KERNEL && functionName == APPLY -> {
                    lastChildCall.finalArguments()?.let { arguments ->
                        // TODO pipelines to apply/3
                        if (arguments.size == 3) {
                            arguments[0].let { maybeModularName ->
                                val modulars = maybeModularName.maybeModularNameToModulars(maxScope = maybeModularName.containingFile, useCall = useCall, incompleteCode = false)

                                var accumlatedKeepProcessing = true

                                for (modular in modulars) {
                                    val modularResolveState = resolveState.putVisitedElement(modular)

                                    val name = useCall?.finalArguments()?.let { arguments ->
                                        if (arguments.size == 2) {
                                            when (val which = arguments[1].stripAccessExpression()) {
                                                is ElixirAtom -> if (which.charListLine == null && which.stringLine == null) {
                                                    which.lastChild.text
                                                } else {
                                                    null
                                                }
                                                else -> null
                                            }
                                        } else {
                                            null
                                        }
                                    }

                                    accumlatedKeepProcessing = if (name != null) {
                                        Modular.callDefinitionClauseCallFoldWhile(modular, name, modularResolveState) { callDefinitionClauseCall, _, arityRange, accResolveState ->
                                            val finalContinue = treeWalkUp(callDefinitionClauseCall, useCall, accResolveState, keepProcessing)
                                            AccumulatorContinue(accResolveState, finalContinue)
                                        }.`continue`
                                    } else {
                                        Modular.callDefinitionClauseCallWhile(modular, modularResolveState) { callDefinitionClauseCall, accResolveState ->
                                            if (CallDefinitionClause.isFunction(callDefinitionClauseCall)) {
                                                treeWalkUp(callDefinitionClauseCall, useCall, accResolveState, keepProcessing)
                                            } else {
                                                true
                                            }
                                        }
                                    }
                                }

                                accumlatedKeepProcessing
                            }
                        } else {
                            true
                        }
                    } ?: true
                }
                resolvedModuleName == KERNEL && functionName == CASE -> {
                    val lastChildCallResolveState = resolveState.putVisitedElement(lastChildCall)

                    Case.treeWalkUp(lastChildCall, lastChildCallResolveState, keepProcessing)
                }
                else -> {
                    var accumulatedKeepProcessing = true

                    for (reference in lastChildCall.references) {
                        val resolvedList: List<PsiElement> = if (reference is PsiPolyVariantReference) {
                            reference
                                    .multiResolve(false)
                                    .mapNotNull { it.element }
                        } else {
                            reference.resolve()?.let { listOf(it) } ?: emptyList()
                        }.filter { !resolveState.hasBeenVisited(it) }

                        for (resolved in resolvedList) {
                            accumulatedKeepProcessing = if (resolved is Call && CallDefinitionClause.`is`(resolved)) {
                                val resolvedResolveSet = resolveState.putVisitedElement(resolved)

                                treeWalkUp(
                                        usingCall = resolved,
                                        useCall = useCall,
                                        resolveState = resolvedResolveSet,
                                        keepProcessing = keepProcessing
                                )
                            } else {
                                true
                            }

                            if (!accumulatedKeepProcessing) {
                                break
                            }
                        }

                        if (!accumulatedKeepProcessing) {
                            break
                        }
                    }

                    accumulatedKeepProcessing
                }
            }
        } else {
            true
        }
    }

    fun definers(modularCall: Call): Sequence<Call> =
            modularCall
                    .macroChildCallSequence()
                    .filter { isDefiner(it) }

    private const val ARITY = 1
    private const val USING = "__using__"

    private fun isDefiner(call: Call): Boolean =
            call.isCalling(KERNEL, DEFMACRO) &&
                    nameArityInterval(call, ResolveState.initial())?.let { nameArityRange ->
                        nameArityRange.name == USING && nameArityRange.arityInterval.contains(ARITY)
                    }
                    ?: false
}
