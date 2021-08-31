package org.elixir_lang.beam.psi.impl

import org.elixir_lang.beam.psi.CallDefinition
import org.elixir_lang.beam.psi.stubs.CallDefinitionStub
import org.elixir_lang.beam.psi.stubs.ModuleStub
import org.elixir_lang.beam.psi.stubs.ModuleStubElementTypes
import org.elixir_lang.psi.Definition
import org.elixir_lang.psi.call.name.Function.*
import org.elixir_lang.psi.call.name.Module.KERNEL
import org.elixir_lang.psi.stub.call.Deserialized

/**
 * A call definition stub fakes a `def` or `defmacro`.
 */
class CallDefinitionStubImpl<T : CallDefinition> : StubbicBase<T>, CallDefinitionStub<T> {
    constructor(parentStub: ModuleStub<*>,
                deserialized: Deserialized,
                callDefinitionClauseHeadArity: Int) : super(
            parentStub,
            ModuleStubElementTypes.CALL_DEFINITION,
            deserialized.name.toString()
    ) {
        val resolvedModuleName = deserialized.resolvedModuleName!!
        assert(resolvedModuleName.toString() == RESOLVED_MODULE_NAME)

        val resolvedFunctionName = deserialized.resolvedFunctionName!!

        this.resolvedFunctionName = resolvedFunctionName.toString()

        assert(deserialized.resolvedFinalArity == RESOLVED_FINAL_ARITY)

        assert(deserialized.hasDoBlockOrKeyword == StubbicBase.HAS_DO_BLOCK_OR_KEYWORD)

        val canonicalNameSet = deserialized.canonicalNameSet
        assert(canonicalNameSet.size == 1)
        assert(canonicalNameSet.iterator().next().toString() == this.name)

        this.callDefinitionClauseHeadArity = callDefinitionClauseHeadArity

        this.definition = when (this.resolvedFunctionName) {
            DEF -> Definition.PUBLIC_FUNCTION
            DEFP -> Definition.PRIVATE_FUNCTION
            DEFMACRO -> Definition.PUBLIC_MACRO
            DEFMACROP -> Definition.PRIVATE_MACRO
            else -> null
        }
    }

    constructor(parentStub: ModuleStub<*>,
                macro: String,
                name: String,
                callDefinitionClauseHeadArity: Int) : super(parentStub, ModuleStubElementTypes.CALL_DEFINITION, name) {
        this.resolvedFunctionName = macro
        this.callDefinitionClauseHeadArity = callDefinitionClauseHeadArity
        this.definition = when (macro) {
            DEF -> Definition.PUBLIC_FUNCTION
            DEFP -> Definition.PRIVATE_FUNCTION
            DEFMACRO -> Definition.PUBLIC_MACRO
            DEFMACROP -> Definition.PRIVATE_MACRO
            else -> null
        }
    }

    override val definition: Definition?

    override fun callDefinitionClauseHeadArity(): Int = callDefinitionClauseHeadArity

    /**
     * Arity of `def ... do` or `defmacro ... do`.
     *
     * @return 2 (1 for the call definition clause head and 1 for the do block)
     */
    override fun resolvedFinalArity(): Int = RESOLVED_FINAL_ARITY

    /**
     * @return name of the function/macro after taking into account any imports
     */
    override fun resolvedFunctionName(): String = resolvedFunctionName

    /**
     * @return [org.elixir_lang.psi.call.name.Module.KERNEL]
     */
    override fun resolvedModuleName(): String = RESOLVED_MODULE_NAME

    override val implementedProtocolName: String? = null

    /*
     * Fields
     */

    private val resolvedFunctionName: String
    /**
     * Arity of the call definition being defined.  Needed to find source element.
     */
    private val callDefinitionClauseHeadArity: Int
}

/**
 * Arity of `def` or `defmacro` call, not the arity of the defined function or macro
 */
private const val RESOLVED_FINAL_ARITY = 2

private const val RESOLVED_MODULE_NAME = KERNEL
