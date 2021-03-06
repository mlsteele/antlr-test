package souplang.grammar;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import souplang.Soup;
import souplang.Soup.Ingredient;


/**
 * Wraps the clean and concise (LOL) ANTLR boilerplate.
 */
public class SoupFactory {
    public static Soup parse(String input) {
        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(input);
        SoupLexer lexer = new SoupLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);

        // Feed the tokens into the parser.
        SoupParser parser = new SoupParser(tokens);
        parser.reportErrorsAsExceptions();

        // Generate the parse tree using the starter rule.
        ParseTree tree = parser.soup(); // "soup" is the starter rule

        // debugging option #1: print the tree to the console
        // System.err.println(tree.toStringTree(parser));

        // debugging option #2: show the tree in a window
        // ((RuleContext)tree).inspect(parser);

        // debugging option #3: walk the tree with a listener
        // new ParseTreeWalker().walk(new PrintEverythingListener(), tree);

        // Finally, construct an AST value by walking over the parse tree.
        ParseTreeWalker walker = new ParseTreeWalker();
        SoupBuilder listener = new SoupBuilder();
        walker.walk(listener, tree);

        // return the value that the listener created
        return listener.getSoup();
    }

    private static class SoupBuilder extends SoupBaseListener {
        private final List<Ingredient> ingredients = new ArrayList<Ingredient>();
        private String rawingredient;
        private String modifier;

        @Override
        public void exitRawingredient(SoupParser.RawingredientContext ctx) {
            rawingredient = ctx.RAWINGREDIENT().getText();
        }

        @Override
        public void exitModifier(SoupParser.ModifierContext ctx) {
            modifier = ctx.MODIFIER().getText();
        }

        @Override
        public void enterIngredient(SoupParser.IngredientContext ctx) {
            rawingredient = null;
            modifier = null;
        }

        @Override
        public void exitIngredient(SoupParser.IngredientContext ctx) {
            ingredients.add(new Soup.Ingredient(rawingredient, modifier));
        }

        public Soup getSoup() {
            return new Soup(ingredients);
        }
    }
}
