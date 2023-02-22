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

public class BirdDatabase {
    // attributes
    private ArrayList<Bird> birds;
    
    // constructors
    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }
    
    // methods
    
    // for add command
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    // for observations command
    public void addByObservation(String birdName) {
        for (Bird bird:this.birds) {
            if (bird.getName().equals(birdName)) {
                // find the bird!
                bird.addNumberOfObervation();
                return;
            }
        }
        // end of loop, if gits here, it's not in the list
        System.out.println("Not a bird");
    }
    
    // for "all" commands
    public void printAllBirds() {
        for (Bird bird:this.birds) {
            System.out.println(bird);
        }
    }
    
    // for "one" commane
    public void printByName(String nameOfBird) {
        for (Bird bird:this.birds) {
            if (bird.getName().equals(nameOfBird)) {
                System.out.println(bird);
            }
        }
    } 
}
