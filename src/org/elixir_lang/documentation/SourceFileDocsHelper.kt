package org.elixir_lang.documentation

import com.intellij.psi.PsiElement
import com.intellij.psi.ResolveState
import org.elixir_lang.psi.*
import org.elixir_lang.psi.CallDefinitionClause.enclosingModularMacroCall
import org.elixir_lang.psi.call.Call
import org.elixir_lang.psi.call.CanonicallyNamed
import org.elixir_lang.psi.impl.ElixirUnmatchedUnqualifiedNoParenthesesCallImpl
import org.elixir_lang.psi.impl.call.macroChildCallList
import org.elixir_lang.psi.stub.type.call.Stub
import org.elixir_lang.structure_view.element.CallDefinitionHead

object SourceFileDocsHelper {
    fun fetchDocs(element: PsiElement): FetchedDocs? = when (element) {
        is Call -> fetchDocs(element)
        else -> null
    }

    private fun fetchDocs(call: Call): FetchedDocs? = when {
        Stub.isModular(call) -> {
            val moduleDoc = (call as? ElixirUnmatchedUnqualifiedNoParenthesesCallImpl)
                    ?.doBlock
                    ?.stab
                    ?.stabBody
                    ?.unmatchedExpressionList
                    ?.asSequence()
                    ?.filterIsInstance<ElixirUnmatchedAtUnqualifiedNoParenthesesCall>()
                    ?.filter { it.atIdentifier.lastChild?.text == "moduledoc" }
                    ?.mapNotNull { (it.lastChild?.firstChild?.firstChild as? Heredoc)?.children?.toList() }
                    ?.flatten()
                    ?.joinToString("") { it.text }

            if (!moduleDoc.isNullOrEmpty()) {
                FetchedDocs.ModuleDocumentation(call.canonicalName().orEmpty(), moduleDoc)
            } else {
                null
            }
        }
        CallDefinitionClause.`is`(call) -> {
            val state = ResolveState.initial()

            CallDefinitionClause.nameArityInterval(call, state)?.let { nameArityRange ->
                enclosingModularMacroCall(call)?.let { modular ->
                    val module = (modular as? CanonicallyNamed)?.canonicalName().orEmpty()

                    modular
                            .macroChildCallList()
                            .mapNotNull { sibling ->
                                if (CallDefinitionClause.`is`(sibling)) {
                                    CallDefinitionClause
                                            .head(sibling)
                                            ?.let { siblingHead ->
                                                CallDefinitionHead
                                                        .nameArityInterval(siblingHead, state)
                                                        ?.let { siblingNameArityInterval ->
                                                            if ((siblingNameArityInterval.name == nameArityRange.name) &&
                                                                    siblingNameArityInterval.arityInterval.overlaps(nameArityRange.arityInterval)) {
                                                                FetchedDocs
                                                                        .FunctionOrMacroDocumentation
                                                                        .fromCallDefinitionClauseCall(module, sibling, siblingHead)
                                                            } else {
                                                                null
                                                            }
                                                        }
                                            }
                                } else {
                                    null
                                }
                            }
                            .takeIf(List<*>::isNotEmpty)
                            ?.reduce { acc, documentation ->
                                acc.merge(documentation)
                            }
                }
            }
        }
        else -> null
    }
}

