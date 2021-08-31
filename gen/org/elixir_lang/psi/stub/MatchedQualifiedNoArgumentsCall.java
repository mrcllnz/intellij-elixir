package org.elixir_lang.psi.stub;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubElement;
import org.elixir_lang.psi.ElixirMatchedQualifiedNoArgumentsCall;
import org.elixir_lang.psi.stub.call.Deserialized;
import org.elixir_lang.psi.stub.call.Stub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class MatchedQualifiedNoArgumentsCall extends Stub<ElixirMatchedQualifiedNoArgumentsCall> {
    public MatchedQualifiedNoArgumentsCall(
            StubElement parent,
            @NotNull IStubElementType elementType,
            @NotNull Deserialized deserialized) {
        super(parent, elementType, deserialized);
    }

    public MatchedQualifiedNoArgumentsCall(
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
