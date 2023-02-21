
import java.util.ArrayList;

public class Menu {
    // attributes
    private ArrayList<String> meals;

    // constructor
    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String newMeal) {
        for (String meal:this.meals) {
            if (meal.equals(newMeal)) {
                // found duplicate, do notjing
                return;
            }
        }
        // end of loop
        this.meals.add(newMeal);
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
    
    public void printMeals() {
        for (String meal:this.meals) {
            System.out.println(meal);
        }
    }
}
    

