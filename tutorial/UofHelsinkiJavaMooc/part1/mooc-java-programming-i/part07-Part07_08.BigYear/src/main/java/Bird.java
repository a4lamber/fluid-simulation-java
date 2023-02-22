/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Bird {
    // attributes
    private String name;
    private String latinName;
    private int numberOfObervation;
    
    // constructors
    public Bird() {
        this.name = "";
        this.latinName = "";
        this.numberOfObervation = 0;
    }
    
    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public int getNumberOfObervation() {
        return numberOfObervation;
    }
    
    public void addNumberOfObervation() {
        this.numberOfObervation += 1;
    }
    
    @Override
    public String toString() {
        return this.getName() + " (" + this.getLatinName() + "): " + this.getNumberOfObervation() + " observations";  
    }
}



