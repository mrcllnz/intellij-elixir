package org.elixir_lang.psi.impl.call

import org.elixir_lang.psi.Implementation
import org.elixir_lang.psi.Implementation.forNameCollection
import org.elixir_lang.psi.Module
import org.elixir_lang.psi.Protocol
import org.elixir_lang.psi.call.StubBased
import org.elixir_lang.psi.stub.type.call.Stub.isModular
import org.elixir_lang.structure_view.element.CallDefinitionClause.Companion.enclosingModularMacroCall

object CanonicallyNamedImpl {
    fun canonicalName(stubBased: StubBased<*>): String? =
        if (isModular(stubBased)) {
            val canonicalNameSuffix = when {
                Implementation.`is`(stubBased) -> {
                    val protocolName = Implementation.protocolName(stubBased)
                    val forName = Implementation.forNameElement(stubBased)?.text

                    "${protocolName ?: '?'}.${forName ?: '?'}"
                }
                Module.`is`(stubBased) -> Module.name(stubBased)
                Protocol.`is`(stubBased) -> Module.name(stubBased)
                else -> null
            }

            val enclosing = enclosingModularMacroCall(stubBased)

            if (enclosing is StubBased<*>) {
                val enclosingStubBased = enclosing as StubBased<*>?
                val canonicalNamePrefix = enclosingStubBased!!.canonicalName()

                "${canonicalNamePrefix ?: '?'}.${canonicalNameSuffix ?: '?'}"
            } else {
                canonicalNameSuffix ?: "?"
            }
        } else {
            stubBased.name
        }


    fun canonicalNameSet(stubBased: StubBased<*>): Set<String> =
            if (isModular(stubBased)) {
                val canonicalNameSuffixSet: Set<String> = if (Implementation.`is`(stubBased)) {
                    val protocolName = Implementation.protocolName(stubBased) ?: "?"
                    val prefix = "$protocolName."

                    stubBased
                            .let { Implementation.forNameElement(it) }
                            ?.let { forNameCollection(it) }
                            ?.map { "$prefix$it" }
                            ?.toSet()
                            ?:
                            enclosingModularMacroCall(stubBased)
                                    ?.let { enclosingModularMacroCall ->
                                        if (enclosingModularMacroCall is StubBased<*> && Module.`is`(enclosingModularMacroCall)) {
                                            canonicalNameSet(enclosingModularMacroCall as StubBased<*>)
                                        } else {
                                            null
                                        }
                                    }
                                    ?.map { "$prefix$it" }
                                    ?.toSet()
                            ?:
                            setOf("$prefix?")
                } else if (Module.`is`(stubBased)) {
                    setOf(Module.name(stubBased))
                } else if (Protocol.`is`(stubBased)) {
                    setOf(Module.name(stubBased))
                } else {
                    setOf("?")
                }

                enclosingModularMacroCall(stubBased)
                        .let { it as? StubBased<*> }
                        ?.let { enclosing ->
                            enclosing
                                    .canonicalNameSet()
                                    .flatMap { canonicalNamePrefix ->
                                        canonicalNameSuffixSet.map { canonicalNameSuffix ->
                                            "$canonicalNamePrefix.$canonicalNameSuffix"
                                        }
                                    }.toSet()
                        } ?: canonicalNameSuffixSet
            } else {
                stubBased.name?.let { setOf(it) } ?: emptySet()
            }
}
