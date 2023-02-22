
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;



public class RecipeSearch {

    public static void main(String[] args) {
        // create three objects
        Scanner scanner = new Scanner(System.in);
        RecipeLibrary recipes = new RecipeLibrary();
        UserInterface ui = new UserInterface(scanner, recipes);
        
        //
        ui.start();
        
    }
}
