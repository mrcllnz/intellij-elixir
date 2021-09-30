package org.elixir_lang.psi.scope.module

import com.intellij.openapi.project.DumbService
import com.intellij.psi.*
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.util.PsiTreeUtil
import org.elixir_lang.Module.concat
import org.elixir_lang.Module.split
import org.elixir_lang.psi.NamedElement
import org.elixir_lang.psi.call.Named
import org.elixir_lang.psi.impl.ElixirPsiImplUtil.ENTRANCE
import org.elixir_lang.psi.impl.call.finalArguments
import org.elixir_lang.psi.impl.stripAccessExpression
import org.elixir_lang.psi.putInitialVisitedElement
import org.elixir_lang.psi.putVisitedElement
import org.elixir_lang.psi.scope.Module
import org.elixir_lang.psi.scope.ResolveResultOrderedSet
import org.elixir_lang.psi.scope.VisitedElementSetResolveResult
import org.elixir_lang.psi.scope.maxScope
import org.elixir_lang.psi.stub.index.ModularName
import org.elixir_lang.psi.visitedElementSet
import org.elixir_lang.reference.module.UnaliasedName
import java.util.*

class MultiResolve internal constructor(private val name: String, private val incompleteCode: Boolean) : Module() {
    /**
     * Decides whether `match` matches the criteria being searched for.  All other [.execute] methods
     * eventually end here.
     *
     * @return `true` to keep processing; `false` to stop processing.
     */
    override fun executeOnAliasedName(match: PsiNamedElement,
                                      aliasedName: String,
                                      state: ResolveState): Boolean =
        executeOnAliasedName(match, aliasedName, name, state)

    private fun executeOnAliasedName(match: PsiNamedElement, aliasedName: String, targetName: String, state: ResolveState): Boolean {
        val aliasedNameState = state.putVisitedElement(match)

        if (aliasedName == targetName) {
            val namePartList = split(targetName)

            // ALIAS_CALL is only set for `as:` usages
            val aliasCall = state.get(ALIAS_CALL)

            if (aliasCall == null) {
                // adds `defmodule Foo.SSH` for `alias Foo.SSH`
                addUnaliasedNamedElementsToResolveResultList(match, namePartList, aliasedNameState.visitedElementSet())
            } else {
                // adds `Foo.SSH` and `defmodule Foo.SSH` for `alias Foo.SSH, as FSSH`
                aliasCall
                        .finalArguments()!!
                        .first()
                        .stripAccessExpression()
                        .let { it as PsiNamedElement }
                        .let { first ->
                            UnaliasedName.unaliasedName(first)?.let { unaliasedName ->
                                val aliasedNameWithoutAs = split(unaliasedName).last()
                                executeOnAliasedName(
                                        first,
                                        aliasedNameWithoutAs,
                                        aliasedNameWithoutAs,
                                        aliasedNameState.put(ALIAS_CALL, null)
                                )
                            }
                        }
            }
        } else {
            val namePartList = split(name)
            val firstNamePart = namePartList[0]

            // alias Foo.SSH, then SSH.Key is name
            if (aliasedName == firstNamePart) {
                val multipleAliasesQualifier = state.get(MULTIPLE_ALIASES_QUALIFIER)
                val suffix = match.name

                addUnaliasedNamedElementsToResolveResultList(match, namePartList, aliasedNameState.visitedElementSet())
            } else if (aliasedName.startsWith(name)) {
                resolveResultOrderedSet.add(match, "alias ${match.text}", false, state.visitedElementSet())
            }
        }

        return resolveResultOrderedSet.keepProcessing(incompleteCode)
    }

    override fun executeOnModularName(modular: Named, modularName: String, state: ResolveState): Boolean {
        if (modularName.startsWith(name)) {
            val validResult = modularName == name
            resolveResultOrderedSet.add(modular, modularName, validResult, state.visitedElementSet())
        }

        return resolveResultOrderedSet.keepProcessing(incompleteCode)
    }

    fun resolveResults(): Array<VisitedElementSetResolveResult> = resolveResultOrderedSet.toList().toTypedArray()

    private val resolveResultOrderedSet = ResolveResultOrderedSet()

    private fun addUnaliasedNamedElementsToResolveResultList(match: PsiNamedElement,
                                                             namePartList: List<String>,
                                                             visitedElementSet: Set<PsiElement>) {
        val unaliasedName = unaliasedName(match, namePartList)

        val project = match.project

        if (!DumbService.isDumb(project)) {
            StubIndex
                    .getInstance()
                    .processElements(
                            ModularName.KEY,
                            unaliasedName,
                            project,
                            GlobalSearchScope.allScope(project),
                            NamedElement::class.java) {
                resolveResultOrderedSet.add(it, unaliasedName, true, visitedElementSet)

                true
            }
        }
    }

    companion object {
        fun resolveResults(name: String,
                           incompleteCode: Boolean,
                           entrance: PsiElement): Array<VisitedElementSetResolveResult> =
                resolveResults(name, incompleteCode, entrance, ResolveState.initial())

        private fun resolveResults(name: String,
                                   incompleteCode: Boolean,
                                   entrance: PsiElement,
                                   state: ResolveState): Array<VisitedElementSetResolveResult> {
            val multiResolve = MultiResolve(name, incompleteCode)
            val maxScope = maxScope(entrance)

            PsiTreeUtil.treeWalkUp(
                    multiResolve,
                    entrance,
                    maxScope,
                    state.put(ENTRANCE, entrance).putInitialVisitedElement(entrance)
            )

            return multiResolve.resolveResults()
        }

        private fun unaliasedName(match: PsiNamedElement, namePartList: List<String>): String {
            val matchUnaliasedName = UnaliasedName.unaliasedName(match)

            val unaliasedNamePartList = ArrayList<String>(namePartList.size)
            unaliasedNamePartList.add(matchUnaliasedName!!)

            for (i in 1 until namePartList.size) {
                unaliasedNamePartList.add(namePartList[i])
            }

            return concat(unaliasedNamePartList)
        }
    }
}
