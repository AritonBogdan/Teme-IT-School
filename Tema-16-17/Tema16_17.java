import java.util.ArrayList;
import java.util.List;

public class Tema16_17 {
    public static void main(String[] args) {

/**1. Design a recipe book where you can add recipes, and search for recipes based on ingredients.
 *class Recipe {private String name;  private List<String> ingredients;}*/

/**2. Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(), metoda public boolean hasIngredient(String ingredient). */

/**3. In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
 * List<Recipe> recipesWithMilk = new ArrayList<>();*/

        RecipeBook recipeBook = new RecipeBook();

        // Adding recipes to the recipe book
        List<String> ingredients1 = new ArrayList<>();
        ingredients1.add("flour");
        ingredients1.add("milk");
        ingredients1.add("chocolate");
        Recipe recipe1 = new Recipe("milkshake", ingredients1);
        recipeBook.addRecipe(recipe1);

        List<String> ingredients2 = new ArrayList<>();
        ingredients2.add("eggs");
        ingredients2.add("Salt");
        ingredients2.add("Pepper");
        Recipe recipe2 = new Recipe("Grilled eggs", ingredients2);
        recipeBook.addRecipe(recipe2);

        // Searching for recipes based on ingredients
        // Creating a list to store recipes with milk
        List<Recipe> recipesWithMilk = new ArrayList<>();

        // Searching for recipes containing milk
        List<Recipe> foundRecipes = recipeBook.searchByIngredient("milk");
        System.out.println("Recipes containing Milk:" + foundRecipes);
        for (Recipe recipe : foundRecipes) {
            System.out.println(recipe.getName());
            // Add the recipe to recipesWithMilk list
            recipesWithMilk.add(recipe);
        }

    }
}
