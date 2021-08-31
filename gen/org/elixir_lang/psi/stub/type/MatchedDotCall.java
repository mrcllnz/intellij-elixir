package org.elixir_lang.psi.stub.type;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.elixir_lang.psi.ElixirMatchedDotCall;
import org.elixir_lang.psi.impl.ElixirMatchedDotCallImpl;
import org.elixir_lang.psi.stub.call.Deserialized;
import org.elixir_lang.psi.stub.type.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class MatchedDotCall extends Stub<org.elixir_lang.psi.stub.MatchedDotCall, ElixirMatchedDotCall> {
    /*
     * Constructors
     */

    public MatchedDotCall(@NotNull String debugName) {
        super(debugName);
    }

    /*
     * Instance Methods
     */

    @Override
    public ElixirMatchedDotCall createPsi(@NotNull org.elixir_lang.psi.stub.MatchedDotCall stub) {
        return new ElixirMatchedDotCallImpl(stub, this);
    }

    @NotNull
    @Override
    public org.elixir_lang.psi.stub.MatchedDotCall createStub(@NotNull ElixirMatchedDotCall psi, StubElement parentStub) {
        return new org.elixir_lang.psi.stub.MatchedDotCall(
                parentStub,
                this,
                psi.resolvedModuleName(),
                psi.functionName(),
                psi.resolvedFinalArity(),
                psi.hasDoBlockOrKeyword(),
                StringUtil.notNullize(psi.getName(), "?"),
                psi.canonicalNameSet(),
                psi.implementedProtocolName()
        );
    }

    @NotNull
    @Override
    public org.elixir_lang.psi.stub.MatchedDotCall deserialize(@NotNull StubInputStream dataStream,
                                                               @Nullable StubElement parentStub) throws IOException {
        Deserialized deserialized = Deserialized.deserialize(dataStream);
        return new org.elixir_lang.psi.stub.MatchedDotCall(parentStub, this, deserialized);
    }
}
