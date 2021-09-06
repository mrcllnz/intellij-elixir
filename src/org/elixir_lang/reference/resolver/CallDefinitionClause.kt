package org.elixir_lang.reference.resolver

import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.ResolveResult
import com.intellij.psi.ResolveState
import com.intellij.psi.impl.source.resolve.ResolveCache
import org.elixir_lang.Arity
import org.elixir_lang.Name
import org.elixir_lang.NameArityInterval
import org.elixir_lang.psi.CallDefinitionClause.enclosingModularMacroCall
import org.elixir_lang.psi.For
import org.elixir_lang.psi.call.Call
import org.elixir_lang.psi.impl.call.finalArguments
import org.elixir_lang.psi.impl.call.macroChildCalls
import org.elixir_lang.structure_view.element.CallDefinitionHead
import org.elixir_lang.structure_view.element.CallDefinitionSpecification.Companion.typeNameArity
import org.elixir_lang.structure_view.element.Delegation

object CallDefinitionClause : ResolveCache.PolyVariantResolver<org.elixir_lang.reference.CallDefinitionClause> {
    override fun resolve(callDefinitionClause: org.elixir_lang.reference.CallDefinitionClause,
                         incompleteCode: Boolean): Array<ResolveResult> =
            enclosingModularMacroCall(callDefinitionClause.moduleAttribute)?.macroChildCalls()?.let { siblings ->
                if (siblings.isNotEmpty()) {
                    val nameArity = typeNameArity(callDefinitionClause.element)
                    val name = nameArity.name
                    val arity = nameArity.arity

                    siblings
                            .flatMap { call -> callToResolveResults(call, name, arity) }
                            .toTypedArray()
                } else {
                    null
                }
            } ?: emptyArray()

    private fun callToResolveResults(call: Call, name: Name, arity: Arity): List<ResolveResult> =
            when {
                org.elixir_lang.psi.CallDefinitionClause.`is`(call) -> {
                    org.elixir_lang.psi.CallDefinitionClause.nameArityInterval(call, ResolveState.initial())
                            ?.let { nameArityInterval -> nameArityIntervalToResolveResult(call, name, arity, nameArityInterval) }
                            ?.let { listOf(it) }
                            .orEmpty()
                }
                Delegation.`is`(call) -> {
                    call
                            .finalArguments()
                            ?.takeIf { it.size == 2 }
                            ?.let { CallDefinitionHead.nameArityInterval(it[0], ResolveState.initial()) }
                            ?.let { nameArityRange -> nameArityIntervalToResolveResult(call, name, arity, nameArityRange) }
                            ?.let { listOf(it) }
                            .orEmpty()
                }
                For.`is`(call) -> {
                    val resolveResultList = mutableListOf<ResolveResult>()

                    For.treeWalkDown(call, ResolveState.initial()) { child, _ ->
                        if (child is Call) {
                            resolveResultList.addAll(callToResolveResults(child, name, arity))
                        }

                        true
                    }

                    resolveResultList
                }
                else -> emptyList()
            }

    private fun nameArityIntervalToResolveResult(call: Call,
                                                 name: Name,
                                                 arity: Arity,
                                                 nameArityInterval: NameArityInterval): PsiElementResolveResult? {
        val definerName = nameArityInterval.name

        return if (definerName.startsWith(name)) {
            val definerArityInterval = nameArityInterval.arityInterval
            val validResult = (arity in definerArityInterval) && (definerName == name)

            PsiElementResolveResult(call, validResult)
        } else {
            null
        }
    }
}
