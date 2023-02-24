/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
import java.util.HashMap;

public class Abbreviations {
    // attributes
    private HashMap<String,String> abbreviationsMap = new HashMap<>();
            
    // constructor
    public Abbreviations() {
        this.abbreviationsMap = new HashMap<>();
    }
    
    // methods
    
    // 
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationsMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviationsMap.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbreviationsMap.get(abbreviation);
    }
}
