// Generated from src/souplang/grammar/Soup.g4 by ANTLR 4.0

package souplang.grammar;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class SoupBaseListener implements SoupListener {
	@Override public void enterModifier(SoupParser.ModifierContext ctx) { }
	@Override public void exitModifier(SoupParser.ModifierContext ctx) { }

	@Override public void enterIngredient(SoupParser.IngredientContext ctx) { }
	@Override public void exitIngredient(SoupParser.IngredientContext ctx) { }

	@Override public void enterSoup(SoupParser.SoupContext ctx) { }
	@Override public void exitSoup(SoupParser.SoupContext ctx) { }

	@Override public void enterRawingredient(SoupParser.RawingredientContext ctx) { }
	@Override public void exitRawingredient(SoupParser.RawingredientContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}