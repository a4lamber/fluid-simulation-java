/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Container {
    // attributes
    private int liquidAmount;
    
    // constructors
    public Container() {
        this.liquidAmount = 0;
    }
    
    // methods
    public int contains() {
        return this.liquidAmount;
    }
    
    public void add(int amount) {
        if (amount < 0) {return;}
       
        this.liquidAmount += amount;
        if (this.liquidAmount > 100) {
            this.liquidAmount = 100;
        }
    }
    //
    public void remove(int amount) {
        if (amount < 0) {return;}
        this.liquidAmount -= amount;
        
        if (this.liquidAmount < 0) {
            this.liquidAmount = 0;
        }
    }
    
    @Override 
    public String toString() {
        return this.liquidAmount + "/100";
    }
    
    
}
