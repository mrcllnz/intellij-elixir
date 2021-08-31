package org.elixir_lang.psi.stub.type;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import org.elixir_lang.psi.ElixirUnmatchedAtUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.impl.ElixirUnmatchedAtUnqualifiedNoParenthesesCallImpl;
import org.elixir_lang.psi.stub.call.Deserialized;
import org.elixir_lang.psi.stub.type.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class UnmatchedAtUnqualifiedNoParenthesesCall extends Stub<org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall, ElixirUnmatchedAtUnqualifiedNoParenthesesCall> {
    /*
     * Constructors
     */

    public UnmatchedAtUnqualifiedNoParenthesesCall(@NotNull String debugName) {
        super(debugName);
    }

    /*
     * Instance Methods
     */

    @Override
    public ElixirUnmatchedAtUnqualifiedNoParenthesesCall createPsi(@NotNull org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall stub) {
        return new ElixirUnmatchedAtUnqualifiedNoParenthesesCallImpl(stub, this);
    }

    @Override
    public org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall createStub(@NotNull ElixirUnmatchedAtUnqualifiedNoParenthesesCall psi, StubElement parentStub) {
        return new org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall(
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
    public org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall deserialize(
            @NotNull StubInputStream dataStream,
            @Nullable StubElement parentStub
    ) throws IOException {
        Deserialized deserialized = Deserialized.deserialize(dataStream);
        return new org.elixir_lang.psi.stub.UnmatchedAtUnqualifiedNoParenthesesCall(parentStub, this, deserialized);
    }
}
