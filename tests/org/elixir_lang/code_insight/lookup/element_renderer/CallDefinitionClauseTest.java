package org.elixir_lang.code_insight.lookup.element_renderer;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;
import org.elixir_lang.psi.call.Call;
import org.jetbrains.annotations.NotNull;

public class CallDefinitionClauseTest extends LightPlatformCodeInsightFixtureTestCase {
    /*
     * Tests
     */

    public void testIssue457ShorterName() {
        String name = "fo";
        LookupElement lookupElement = lookupElement(name);
        LookupElementPresentation lookupElementPresentation = new LookupElementPresentation();

        lookupElement.renderElement(lookupElementPresentation);

        assertEquals(name, lookupElementPresentation.getItemText());
    }

    public void testIssue457EqualName() {
        String name = "foo";
        LookupElement lookupElement = lookupElement(name);
        LookupElementPresentation lookupElementPresentation = new LookupElementPresentation();

        lookupElement.renderElement(lookupElementPresentation);

        assertEquals(name, lookupElementPresentation.getItemText());
    }

    public void testIssue457LongerName() {
        LookupElement lookupElement = lookupElement("fooo");
        LookupElementPresentation lookupElementPresentation = new LookupElementPresentation();
        boolean assertionErrorThrown = false;

        try {
            lookupElement.renderElement(lookupElementPresentation);
        } catch (AssertionError e) {
            assertionErrorThrown = true;
        }

        assertTrue(assertionErrorThrown);
    }

    /*
     * Protected Instance Methods
     */

    @Override
    protected String getTestDataPath() {
        return "testData/org/elixir_lang/code_insight/lookup/element_renderer/call_definition_clause";
    }

    /*
     * Private Instance Methods
     */

    private LookupElement lookupElement(@NotNull String name) {
        myFixture.configureByFile("issue_457.ex");

        PsiElement elementAtCaret = myFixture.getFile().findElementAt(myFixture.getCaretOffset());

        assertNotNull(elementAtCaret);

        PsiElement maybeDefElement = elementAtCaret.getParent().getParent();

        assertInstanceOf(maybeDefElement, Call.class);

        Call maybeDefCall = (Call) maybeDefElement;

        assertTrue(org.elixir_lang.structure_view.element.CallDefinitionClause.is(maybeDefCall));

        return org.elixir_lang.code_insight.lookup.element.CallDefinitionClause.createWithSmartPointer(
                name,
                maybeDefElement
        );
    }
}