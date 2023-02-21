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

public class UserInterface {
    // attributes
    private TodoList list;
    private Scanner scanner;
    
    // constructors
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    // methods
    public void start() {
        // 
        
        while (true) {
            System.out.print("Command: ");
            String userCommand = this.scanner.nextLine();
            
            if (userCommand.equals("stop")) {
                break;
            }
            
            if (userCommand.equals("add")) {
                System.out.print("To add: ");
                String userInput = this.scanner.nextLine();
                this.list.add(userInput);
                continue;
            }
            
            if (userCommand.equals("list")) {
                this.list.print();
            }
            
            if (userCommand.equals("remove")) {
                System.out.print("Which one is removed? ");
                int userInputNumber = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(userInputNumber);
            }
        }
    }
}
