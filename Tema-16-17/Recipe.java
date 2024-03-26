import java.util.List;

public class Recipe {
    private String name;
    private List<String> ingredients;

    public Recipe(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    /** Method to check if a recipe has a specific ingredient*/
    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }
}
