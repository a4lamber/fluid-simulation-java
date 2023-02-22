
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class RecipeLibrary {
    private ArrayList<Recipe> recipes;
    
    // constructors
    public RecipeLibrary() {
        this.recipes = new ArrayList<>();
    }
    
    // methods
    public void printListRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe:this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public Recipe get(int number) {
        return recipes.get(number);
    }
    
    // add recipe to the list
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printByName(String comparedName) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(comparedName)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printByCookingTime (int maxCookingTime) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe:this.recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void printByIngredient (String comparedIngredient) {
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe:this.recipes) {
            for (String ingredient:recipe.getListOfIngredients()) {
                if (ingredient.equals(comparedIngredient)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }
    
}
