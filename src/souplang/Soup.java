package souplang;

import java.util.List;

public class Soup {
    private final List<Ingredient> ingredients;

    public Soup(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Nondescript soup.";
    }


    public class Ingredient {
        /**
         * @param modifier can be null.
         */
        Ingredient(String modifier, String rawingredient) {}
    }
}
