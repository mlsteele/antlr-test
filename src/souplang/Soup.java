package souplang;

import java.util.Collections;
import java.util.List;

public class Soup {
    private final List<Ingredient> ingredients;

    public Soup(List<Ingredient> ingredients) {
        this.ingredients = Collections.unmodifiableList(ingredients);
    }

    @Override
    public String toString() {
        String soupString = "Soup: ";
        for (Ingredient ingredient : ingredients) {
            soupString += ingredient;
            soupString += ", ";
        }
        // chop final comma
        final int l = soupString.length();
        soupString = soupString.substring(0, l-2);
        return soupString;
    }


    public static class Ingredient {
        private final String rawingredient;
        private final String modifier;

        /**
         * @param modifier can be null.
         */
        public Ingredient(String rawingredient, String modifier) {
            this.rawingredient = rawingredient;
            this.modifier = modifier;
        }

        @Override
        public String toString() {
            if (modifier != null) {
                return modifier + " " + rawingredient;
            } else {
                return rawingredient;
            }
        }
    }
}
