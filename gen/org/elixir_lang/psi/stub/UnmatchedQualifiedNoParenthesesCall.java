package org.elixir_lang.psi.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import org.elixir_lang.psi.ElixirUnmatchedQualifiedNoParenthesesCall;
import org.elixir_lang.psi.stub.call.Deserialized;
import org.elixir_lang.psi.stub.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class UnmatchedQualifiedNoParenthesesCall extends Stub<ElixirUnmatchedQualifiedNoParenthesesCall> {
    public UnmatchedQualifiedNoParenthesesCall(
            StubElement parent,
            @NotNull IStubElementType elementType,
            @NotNull Deserialized deserialized
    ) {
        super(parent, elementType, deserialized);
    }

    public UnmatchedQualifiedNoParenthesesCall(
            StubElement parent,
            @NotNull IStubElementType elementType,
            @Nullable String resolvedModuleName,
            @Nullable String resolvedFunctionName,
            int resolvedFinalArity,
            boolean hasDoBlockOrKeyword,
            @NotNull String name,
            @NotNull Set<String> canonicalNameSet,
            @Nullable String implementedProtocolName
    ) {
        super(
                parent,
                elementType,
                resolvedModuleName,
                resolvedFunctionName,
                resolvedFinalArity,
                hasDoBlockOrKeyword,
                name,
                canonicalNameSet,
                implementedProtocolName
        );
    }
}
