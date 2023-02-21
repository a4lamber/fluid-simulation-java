/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */

import java.util.Scanner;

public class TextUI {
    // attributes
    private Scanner scanner;
    private SimpleDictionary dictionary;
    // constructors
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    // methods
    public void start() {
        
        while(true) {
            System.out.print("Command: ");
            String userInputCommand = scanner.nextLine();
            
            if (userInputCommand.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } 
            
            if (userInputCommand.equals("add")) {
                // ask user for key-value pair 
                System.out.print("Word: ");
                String userWord = scanner.nextLine();
                System.out.print("Translation: ");
                String userTranslation = scanner.nextLine();
                // add it to the dictoinary
                dictionary.add(userWord,userTranslation);
                // jump out current iteration 
                continue;
            }
            
            if (userInputCommand.equals("search")) {
                System.out.print("To be translated: ");
                String userWord = scanner.nextLine();
                
                // 
                String translatedWord = dictionary.translate(userWord);
                if (translatedWord == null) {
                    System.out.println("Word "+ userWord +" was not found");
                    continue;
                }
                System.out.println("Translation: " + translatedWord);
                continue;
            }
            
            
            System.out.println("Unknown command");
        }
        // end of the loop

    }
    
    
//    public Boolean jumpCondition(String userInputCommand) {
//        if (userInputCommand.equals("end"))
//        
//    }
}
