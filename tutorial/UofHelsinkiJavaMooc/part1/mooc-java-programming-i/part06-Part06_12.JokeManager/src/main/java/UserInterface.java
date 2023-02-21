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
    private JokeManager jokes;
    private Scanner scanner;
    
    // constructors
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    // methods
    public void start() {
        this.AskUsers();
    }
    
    
    public void AskUsers() {
        // provide user with some instructions
        
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String userCommand = this.scanner.nextLine();
            
            if (userCommand.equals("X")) {
                return;
            }
            
            if (userCommand.equals("1")) {
                System.out.println("Write the joke to be added:");
                String userJoke = this.scanner.nextLine();
                this.jokes.addJoke(userJoke);
                continue;
            }
            
            if (userCommand.equals("2")) {
                System.out.println(this.jokes.drawJoke());
            }
            
            if (userCommand.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
            
        
        // 
        
    }
}


//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> jokes = new ArrayList<>();
//        System.out.println("What a joke!");
//        while (true) {
//        System.out.println("Commands:");
//        System.out.println(" 1 - add a joke");
//        System.out.println(" 2 - draw a joke");
//        System.out.println(" 3 - list jokes");
//        System.out.println(" X - stop");
//        String command = scanner.nextLine();
//        if (command.equals("X")) {
//        break;
//        }
//        if (command.equals("1")) {
//        System.out.println("Write the joke to be added:");
//        String joke = scanner.nextLine();
//        jokes.add(joke);
//        } else if (command.equals("2")) {
//        System.out.println("Drawing a joke.");
//        if (jokes.isEmpty()) {
//        System.out.println("Jokes are in short supply.");
//        } else {
//        Random draw = new Random();
//        int index = rand.nextInt(jokes.size());
//        System.out.println(jokes.get(index));
//        }
//        } else if (command.equals("3")) {
//        System.out.println("Printing the jokes.");
//        for (String joke : jokes) {
//        System.out.println(joke);
//        }
//        }
//        }