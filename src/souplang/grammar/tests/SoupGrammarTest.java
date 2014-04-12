package souplang.grammar.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import souplang.grammar.SoupFactory;

public class SoupGrammarTest {
    @Test
    public void testSomeSoup() {
        String input = "bowl hot peppers eggs mild onion";
        String expected = "Soup: hot peppers, eggs, mild onion";
        assertEquals(expected, SoupFactory.parse(input).toString());
    }

    @Test(expected=syntaxerror)
    public void testMalformedSoup() {
        String input = "bowl hot peppers eggs onion mild";
        String expected = "Soup: hot peppers, eggs, mild onion";
        assertEquals(expected, SoupFactory.parse(input).toString());
    }
}
