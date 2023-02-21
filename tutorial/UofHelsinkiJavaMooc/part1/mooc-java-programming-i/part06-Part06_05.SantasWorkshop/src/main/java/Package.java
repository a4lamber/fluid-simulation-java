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

public class Package {
    // attributes
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    // constructors
    public Package() {
        this.gifts = new ArrayList<Gift>();
    }
    
    
    // methods
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift:gifts) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
