/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.AbstractList;
import java.util.Scanner;

public class UserInterface {
    // attributes
    private BirdDatabase birds;
    private Scanner scanner;
    // constructors
    public UserInterface(BirdDatabase birds, Scanner scanner) {
        this.birds = birds;
        this.scanner = scanner;
    }
    
    // methods
    public void start() {
        this.askUser();
    }
    
    public void askUser() {
        while (true) {
            System.out.print("? ");
            String command = this.scanner.nextLine();
            
            if (command.equals("Quit")) {
                return;
            }
            
            if (command.equals("Add")) {
                Bird bird = new Bird();
                System.out.print("Name: ");
                String birdName = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String birdLatinName = this.scanner.nextLine();
                // set variables to the bird object
                bird.setName(birdName);
                bird.setLatinName(birdLatinName);
                // add bird object to the birds
                this.birds.addBird(bird);
            }
            
            if (command.equals("All")) {
                this.birds.printAllBirds();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = this.scanner.nextLine();
                this.birds.printByName(birdName);
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = this.scanner.nextLine();
                this.birds.addByObservation(birdName);
            }
         }
    }
}
