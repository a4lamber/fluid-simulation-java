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
import java.util.Scanner;
import java.nio.file.Paths;

public class UserInterface {
    // attributes
    private Scanner scanner;
    private RecipeLibrary recipes;
    
    // constructors
    public UserInterface(Scanner scanner, RecipeLibrary recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    // methods
    public void start() {
        readFile();
        askUsers();
    }
    public void askUsers() {
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = this.scanner.nextLine();
            
            // stop command
            if (command.equals("stop")) {
                return;
            }            
            
            if (command.equals("list")) {
                this.recipes.printListRecipes();
                continue;
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String name = this.scanner.nextLine();
                this.recipes.printByName(name);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(this.scanner.nextLine());
                this.recipes.printByCookingTime(maxTime);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                this.recipes.printByIngredient(ingredient);
            }
            
        }
    }
    
    
    // read the file
    public void readFile() {
        // ask users for file
        System.out.print("File to read: ");
        String filename = this.scanner.nextLine();
  
        ArrayList<String> everyLineInFile = new ArrayList<>();
        
        // we create a scanner for reading the file
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            // we read the file until all lines have been read
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                everyLineInFile.add(line);

            }
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // end of reading the file into an array, now we need to parse it to different
        // parts of it
        
        int i = 0;
        while (i < everyLineInFile.size()) {
            // create a new recipe and add name and cooking time
            Recipe r = new Recipe();
            r.setName(everyLineInFile.get(i++));
            r.setCookingTime(Integer.valueOf(everyLineInFile.get(i++)));
            // declare a arraylist of string to store incredients
            ArrayList<String> newIngredients = new ArrayList<>();
            
            // 最后一行或者遇到empty line是跳出条件
            while(i < everyLineInFile.size() && !everyLineInFile.get(i).isEmpty()) {
                newIngredients.add(everyLineInFile.get(i++));
            }
            i++; // now at empty line or end of array, so need to increment by one
            r.setListOfIngredients(newIngredients);
            this.recipes.add(r);
        }
    }
}
