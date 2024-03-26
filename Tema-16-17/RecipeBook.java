import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    private List<Recipe> recipes;

    public RecipeBook() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    // Method to search for recipes based on ingredients
    public List<Recipe> searchByIngredient(String ingredient) {
        List<Recipe> result = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.hasIngredient(ingredient)) {
                result.add(recipe);
            }
        }
        return result;
    }
}
