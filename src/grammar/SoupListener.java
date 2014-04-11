// Generated from src/grammar/Soup.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SoupListener extends ParseTreeListener {
	void enterModifier(SoupParser.ModifierContext ctx);
	void exitModifier(SoupParser.ModifierContext ctx);

	void enterIngredient(SoupParser.IngredientContext ctx);
	void exitIngredient(SoupParser.IngredientContext ctx);

	void enterSoup(SoupParser.SoupContext ctx);
	void exitSoup(SoupParser.SoupContext ctx);

	void enterRawingredient(SoupParser.RawingredientContext ctx);
	void exitRawingredient(SoupParser.RawingredientContext ctx);
}