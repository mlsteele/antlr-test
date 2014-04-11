// Generated from src/souplang/grammar/Soup.g4 by ANTLR 4.0

package souplang.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SoupParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOWLSTART=1, MODIFIER=2, RAWINGREDIENT=3, WHITESPACE=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'bowl'", "MODIFIER", "RAWINGREDIENT", "WHITESPACE"
	};
	public static final int
		RULE_soup = 0, RULE_ingredient = 1, RULE_modifier = 2, RULE_rawingredient = 3;
	public static final String[] ruleNames = {
		"soup", "ingredient", "modifier", "rawingredient"
	};

	@Override
	public String getGrammarFileName() { return "Soup.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SoupParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SoupContext extends ParserRuleContext {
		public TerminalNode BOWLSTART() { return getToken(SoupParser.BOWLSTART, 0); }
		public List<IngredientContext> ingredient() {
			return getRuleContexts(IngredientContext.class);
		}
		public IngredientContext ingredient(int i) {
			return getRuleContext(IngredientContext.class,i);
		}
		public SoupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).enterSoup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).exitSoup(this);
		}
	}

	public final SoupContext soup() throws RecognitionException {
		SoupContext _localctx = new SoupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_soup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(BOWLSTART);
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9); ingredient();
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFIER || _la==RAWINGREDIENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IngredientContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public RawingredientContext rawingredient() {
			return getRuleContext(RawingredientContext.class,0);
		}
		public IngredientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).enterIngredient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).exitIngredient(this);
		}
	}

	public final IngredientContext ingredient() throws RecognitionException {
		IngredientContext _localctx = new IngredientContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ingredient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(14); modifier();
				}
			}

			setState(17); rawingredient();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(SoupParser.MODIFIER, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(MODIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawingredientContext extends ParserRuleContext {
		public TerminalNode RAWINGREDIENT() { return getToken(SoupParser.RAWINGREDIENT, 0); }
		public RawingredientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawingredient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).enterRawingredient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoupListener ) ((SoupListener)listener).exitRawingredient(this);
		}
	}

	public final RawingredientContext rawingredient() throws RecognitionException {
		RawingredientContext _localctx = new RawingredientContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rawingredient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(RAWINGREDIENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\6\32\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\6\2\r\n\2\r\2\16\2\16"+
		"\3\3\5\3\22\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\2\6\2\4\6\b\2\2\27\2\n\3\2"+
		"\2\2\4\21\3\2\2\2\6\25\3\2\2\2\b\27\3\2\2\2\n\f\7\3\2\2\13\r\5\4\3\2\f"+
		"\13\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\3\3\2\2\2\20\22"+
		"\5\6\4\2\21\20\3\2\2\2\21\22\3\2\2\2\22\23\3\2\2\2\23\24\5\b\5\2\24\5"+
		"\3\2\2\2\25\26\7\4\2\2\26\7\3\2\2\2\27\30\7\5\2\2\30\t\3\2\2\2\4\16\21";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}