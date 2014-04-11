// Generated from src/souplang/grammar/Soup.g4 by ANTLR 4.0

package souplang.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoupLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOWLSTART=1, MODIFIER=2, RAWINGREDIENT=3, WHITESPACE=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'bowl'", "MODIFIER", "RAWINGREDIENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"BOWLSTART", "MODIFIER", "RAWINGREDIENT", "WHITESPACE"
	};


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


	public SoupLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Soup.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\6\67\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\6\5\62"+
		"\n\5\r\5\16\5\63\3\5\3\5\2\6\3\3\1\5\4\1\7\5\1\t\6\2\3\2\3\5\13\f\17\17"+
		"\"\";\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\34"+
		"\3\2\2\2\7.\3\2\2\2\t\61\3\2\2\2\13\f\7d\2\2\f\r\7q\2\2\r\16\7y\2\2\16"+
		"\17\7n\2\2\17\4\3\2\2\2\20\21\7j\2\2\21\22\7q\2\2\22\35\7v\2\2\23\24\7"+
		"o\2\2\24\25\7k\2\2\25\26\7n\2\2\26\35\7f\2\2\27\30\7i\2\2\30\31\7t\2\2"+
		"\31\32\7q\2\2\32\33\7u\2\2\33\35\7u\2\2\34\20\3\2\2\2\34\23\3\2\2\2\34"+
		"\27\3\2\2\2\35\6\3\2\2\2\36\37\7q\2\2\37 \7p\2\2 !\7k\2\2!\"\7q\2\2\""+
		"/\7p\2\2#$\7g\2\2$%\7i\2\2%&\7i\2\2&/\7u\2\2\'(\7r\2\2()\7g\2\2)*\7r\2"+
		"\2*+\7r\2\2+,\7g\2\2,-\7t\2\2-/\7u\2\2.\36\3\2\2\2.#\3\2\2\2.\'\3\2\2"+
		"\2/\b\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\5\2\2\66\n\3\2\2\2\6\2\34.\63";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}