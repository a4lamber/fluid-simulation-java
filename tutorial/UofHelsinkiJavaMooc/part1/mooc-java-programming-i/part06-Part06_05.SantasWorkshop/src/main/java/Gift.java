/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Gift {
    // attributes
    private String name;
    private int weight;
    
    // constructors
    public Gift(String name,int weight) {
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
        
    public String toString() {
        return this.getName() + " (" + this.getWeight() +"kg)";
    }
} 
