package org.elixir_lang.psi.stub.type;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.elixir_lang.psi.ElixirUnmatchedDotCall;
import org.elixir_lang.psi.impl.ElixirUnmatchedDotCallImpl;
import org.elixir_lang.psi.stub.call.Deserialized;
import org.elixir_lang.psi.stub.type.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class UnmatchedDotCall extends Stub<org.elixir_lang.psi.stub.UnmatchedDotCall, ElixirUnmatchedDotCall> {
    /*
     * Constructors
     */

    public UnmatchedDotCall(@NotNull String debugName) {
        super(debugName);
    }

    /*
     * Instance Methods
     */

    @Override
    public ElixirUnmatchedDotCall createPsi(@NotNull org.elixir_lang.psi.stub.UnmatchedDotCall stub) {
        return new ElixirUnmatchedDotCallImpl(stub, this);
    }

    @Override
    public org.elixir_lang.psi.stub.UnmatchedDotCall createStub(@NotNull ElixirUnmatchedDotCall psi, StubElement parentStub) {
        return new org.elixir_lang.psi.stub.UnmatchedDotCall(
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
    public org.elixir_lang.psi.stub.UnmatchedDotCall deserialize(@NotNull StubInputStream dataStream,
                                                                 @Nullable StubElement parentStub) throws IOException {
        Deserialized deserialized = Deserialized.deserialize(dataStream);
        return new org.elixir_lang.psi.stub.UnmatchedDotCall(parentStub, this, deserialized);
    }
}
