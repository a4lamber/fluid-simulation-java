/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Fitbyte {
    // attributes
    private int age;
    private int restingHeartRate;
    
    // constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    // methods
    public double targetHeartRate(double percentageOfMaximum) {
        
        double targetHeartRate = 0;
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        
        targetHeartRate = (maximumHeartRate - this.restingHeartRate) 
                        * percentageOfMaximum + this.restingHeartRate;
        
        
        return targetHeartRate;
    }
    
    
}
