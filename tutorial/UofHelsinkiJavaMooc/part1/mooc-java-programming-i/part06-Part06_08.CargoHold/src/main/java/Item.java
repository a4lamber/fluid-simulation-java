/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Item {
    // attributes
    private String name;
    private int weight;
    
    // constructors
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    
    // methods
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
