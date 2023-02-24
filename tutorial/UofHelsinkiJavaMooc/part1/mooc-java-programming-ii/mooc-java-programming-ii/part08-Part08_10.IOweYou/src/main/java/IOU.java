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

public class IOU {
    // attributes
    private HashMap<String, Double> hash;
            
    // constructors
    public IOU() {
        this.hash = new HashMap<>();
    }
    
    // methods
    public void setSum(String toWhom, double amount) {
        this.hash.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (this.hash.containsKey(toWhom)) {
            return this.hash.get(toWhom);
        }
        // not found
        return 0.0;
    }
    
}
