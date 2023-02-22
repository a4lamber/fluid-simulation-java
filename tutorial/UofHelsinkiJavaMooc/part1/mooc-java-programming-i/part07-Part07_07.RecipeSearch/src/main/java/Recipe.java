/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.ArrayList;

public class Recipe {
    // attributes
    private String name;
    private int cookingTime;
    private ArrayList<String> listOfIngredients;
    
    // constructors
    public Recipe() {
        this.name = "";
        this.cookingTime = 0;
        this.listOfIngredients = new ArrayList<String>();
    }
    // methods
    
    // add an ingredient to the recipe    
    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setListOfIngredients(ArrayList<String> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }
    
    public void clear() {
        // reset it
        this.name = "";
        this.cookingTime = 0;
        this.listOfIngredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getListOfIngredients() {
        return listOfIngredients;
    }
    
    // 
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime; 
    }
    
    
    
}
