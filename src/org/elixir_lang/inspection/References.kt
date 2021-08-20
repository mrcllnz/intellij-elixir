package org.elixir_lang.inspection

import com.intellij.codeInspection.*
import com.intellij.psi.*
import org.elixir_lang.psi.*
import org.elixir_lang.psi.call.Call

class References : LocalInspectionTool() {
    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean, session: LocalInspectionToolSession): PsiElementVisitor {
        return object : ElixirVisitor() {
            override fun visitElement(element: PsiElement) {
                when (element) {
                    is ElixirAlias -> visitAlias(element)
                    is Call -> visitCall(element)
                }
            }

            override fun visitAlias(alias: ElixirAlias) {
                alias.reference?.let { reference -> registerProblem(alias, reference) }
            }

            override fun visitAtNonNumericOperation(atNonNumericOperation: AtNonNumericOperation) {
                atNonNumericOperation.reference?.let { reference -> registerProblem(atNonNumericOperation, reference) }
            }

            override fun visitUnmatchedQualifiedNoArgumentsCall(qualifiedNoArgumentsCall: ElixirUnmatchedQualifiedNoArgumentsCall) =
                visitQualifiedNoArgumentsCall(qualifiedNoArgumentsCall)

            override fun visitMatchedQualifiedNoArgumentsCall(qualifiedNoArgumentsCall: ElixirMatchedQualifiedNoArgumentsCall) =
                visitQualifiedNoArgumentsCall(qualifiedNoArgumentsCall)

            override fun visitMatchedQualifiedParenthesesCall(qualifiedParenthesesCall: ElixirMatchedQualifiedParenthesesCall) {
                visitQualifiedParenthesesCall(qualifiedParenthesesCall)
            }

            override fun visitUnmatchedQualifiedParenthesesCall(qualifiedParenthesesCall: ElixirUnmatchedQualifiedParenthesesCall) {
                visitQualifiedParenthesesCall(qualifiedParenthesesCall)
            }

            private fun visitCall(call: Call) {
                call.reference?.let { reference -> registerProblem(call, reference) }
            }

            private fun visitQualifiedNoArgumentsCall(qualifiedNoArgumentsCall: QualifiedNoArgumentsCall<*>) {
                when (qualifiedNoArgumentsCall.qualifier()) {
                    // Can't resolve keys or fields of a module attribute or assign
                    is AtNonNumericOperation,
                    // Can't resolve key or fields of a capture
                    is ElixirCaptureNumericOperation,
                    // Can't resolve keys or fields of a variable
                    is UnqualifiedNoArgumentsCall<*>,
                    // Can't resolve a chain of keys or fields
                    is QualifiedNoArgumentsCall<*>,
                    // Can't resolve keys or fields on the output of a function call
                    is QualifiedParenthesesCall<*> -> Unit
                    else -> visitCall(qualifiedNoArgumentsCall)
                }
            }

            private fun visitQualifiedParenthesesCall(qualifiedParenthesesCall: QualifiedParenthesesCall<*>) {
                when (qualifiedParenthesesCall.qualifier()) {
                    // Can't resolve function calls except for invalid results on a variable
                    is UnqualifiedNoArgumentsCall<*>,
                    // Can't resolve function calls except for invalid results on key or field
                    is QualifiedNoArgumentsCall<*> -> Unit
                    else -> visitCall(qualifiedParenthesesCall)
                }
            }

            private fun registerProblem(element: PsiElement, reference: PsiReference) {
                if (reference is PsiPolyVariantReference) {
                    registerProblem(element, reference)
                } else {
                    val resolved = reference.resolve()

                    if (resolved == null) {
                        holder.registerProblem(element, "Does not resolve to anything", ProblemHighlightType.ERROR)
                    }
                }
            }

            private fun registerProblem(element: PsiElement, reference: PsiPolyVariantReference) {
                val resolveResults = reference.multiResolve(false)

                if (resolveResults.isEmpty()) {
                    holder.registerProblem(element, "Does not resolve to anything", ProblemHighlightType.ERROR)
                } else if (!resolveResults.any { it.isValidResult }) {
                    holder.registerProblem(element, "Only resolves to invalid results", ProblemHighlightType.ERROR)
                }
            }
        }
    }
}
