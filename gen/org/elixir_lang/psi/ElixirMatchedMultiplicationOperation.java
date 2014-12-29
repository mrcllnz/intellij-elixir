// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ElixirMatchedMultiplicationOperation extends PsiElement {

  @NotNull
  List<ElixirAccessExpression> getAccessExpressionList();

  @NotNull
  List<ElixirEmptyParentheses> getEmptyParenthesesList();

  @NotNull
  List<ElixirMatchedAtOperation> getMatchedAtOperationList();

  @NotNull
  List<ElixirMatchedHatOperation> getMatchedHatOperationList();

  @Nullable
  ElixirMatchedMultiplicationOperation getMatchedMultiplicationOperation();

  @NotNull
  List<ElixirMatchedNonNumericCaptureOperation> getMatchedNonNumericCaptureOperationList();

  @NotNull
  List<ElixirMatchedUnaryOperation> getMatchedUnaryOperationList();

  @NotNull
  ElixirMultiplicationInfixOperator getMultiplicationInfixOperator();

  @NotNull
  List<ElixirNoParenthesesCall> getNoParenthesesCallList();

  @NotNull
  List<ElixirNoParenthesesOneExpression> getNoParenthesesOneExpressionList();

}
