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
        
public class Hold {
    // attributes
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    // constructors
    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maximumWeight = maximumWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase:this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
            
    
    // methods
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase:suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        // 不需要考虑空的和1的情况了嘛
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
}


