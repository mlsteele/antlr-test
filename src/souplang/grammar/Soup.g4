grammar Soup;

// This puts a Java package statement at the top of the output Java files.
@header {
package souplang.grammar;
}

// This adds code to the generated lexer and parser.
@members {
    /**
     * Call this method to have the lexer or parser throw a RuntimeException if
     * it encounters an error.
     */
    public void reportErrorsAsExceptions() {
        addErrorListener(new ExceptionThrowingErrorListener());
    }

    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new RuntimeException(msg);
        }
    }
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 * *** ANTLR requires tokens to be CAPITALIZED, like START_ITALIC, END_ITALIC, and TEXT.
 */
BOWLSTART : 'bowl' ;
MODIFIER : 'hot' | 'mild' | 'gross' ;
RAWINGREDIENT : 'onion' | 'eggs' | 'peppers' ;
WHITESPACE : [ \t\r\n]+ -> skip ;

/*
 * These are the parser rules. They define the structures used by the parser.
 * *** ANTLR requires grammar nonterminals to be lowercase, like html, normal, and italic.
 */
soup : BOWLSTART ingredient+ ;
ingredient : modifier? rawingredient ;
modifier : MODIFIER ;
rawingredient : RAWINGREDIENT ;
