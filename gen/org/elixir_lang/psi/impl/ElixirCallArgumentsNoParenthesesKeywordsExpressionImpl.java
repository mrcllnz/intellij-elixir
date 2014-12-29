// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.elixir_lang.psi.ElixirTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.elixir_lang.psi.*;

public class ElixirCallArgumentsNoParenthesesKeywordsExpressionImpl extends ASTWrapperPsiElement implements ElixirCallArgumentsNoParenthesesKeywordsExpression {

  public ElixirCallArgumentsNoParenthesesKeywordsExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitCallArgumentsNoParenthesesKeywordsExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ElixirAccessExpression getAccessExpression() {
    return findChildByClass(ElixirAccessExpression.class);
  }

  @Override
  @Nullable
  public ElixirEmptyParentheses getEmptyParentheses() {
    return findChildByClass(ElixirEmptyParentheses.class);
  }

  @Override
  @NotNull
  public ElixirKeywordKey getKeywordKey() {
    return findNotNullChildByClass(ElixirKeywordKey.class);
  }

  @Override
  @Nullable
  public ElixirMatchedAtOperation getMatchedAtOperation() {
    return findChildByClass(ElixirMatchedAtOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedHatOperation getMatchedHatOperation() {
    return findChildByClass(ElixirMatchedHatOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedMultiplicationOperation getMatchedMultiplicationOperation() {
    return findChildByClass(ElixirMatchedMultiplicationOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedNonNumericCaptureOperation getMatchedNonNumericCaptureOperation() {
    return findChildByClass(ElixirMatchedNonNumericCaptureOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedUnaryOperation getMatchedUnaryOperation() {
    return findChildByClass(ElixirMatchedUnaryOperation.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesCall getNoParenthesesCall() {
    return findChildByClass(ElixirNoParenthesesCall.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesManyStrictNoParenthesesExpression getNoParenthesesManyStrictNoParenthesesExpression() {
    return findChildByClass(ElixirNoParenthesesManyStrictNoParenthesesExpression.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesOneExpression getNoParenthesesOneExpression() {
    return findChildByClass(ElixirNoParenthesesOneExpression.class);
  }

}
