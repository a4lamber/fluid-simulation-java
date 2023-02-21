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
import java.util.Random;

public class JokeManager {
    // attributes
    private ArrayList<String> jokes;
    
    // constructors
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    // methods
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        // check for empty 
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        // not empty
        Random rand = new Random();
        return this.jokes.get(rand.nextInt(this.jokes.size()));
    }
    
    
    
    public void printJokes() {
        for (String joke:this.jokes) {
            System.out.println(joke);
        }
    }
    
}
