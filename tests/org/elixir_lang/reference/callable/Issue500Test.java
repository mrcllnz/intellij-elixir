package org.elixir_lang.reference.callable;

import com.intellij.psi.PsiElement;
import org.elixir_lang.PlatformTestCase;
import org.elixir_lang.psi.call.Call;

import static org.elixir_lang.reference.Callable.isVariable;

public class Issue500Test extends PlatformTestCase {
    /*
     * Tests
     */

    public void testIsVariable() {
        myFixture.configureByFiles("is_variable.ex");
        @SuppressWarnings("ConstantConditions") PsiElement callable = myFixture
                .getFile()
                .findElementAt(myFixture.getCaretOffset())
                .getParent()
                .getParent();

        assertInstanceOf(callable, Call.class);
        assertFalse("parameter in tuple after Alias dot is incorrectly marked as a variable", isVariable(callable));
    }

    /*
     * Protected Instance Methods
     */

    @Override
    protected String getTestDataPath() {
        return "testData/org/elixir_lang/reference/callable/issue_500";
    }
}
