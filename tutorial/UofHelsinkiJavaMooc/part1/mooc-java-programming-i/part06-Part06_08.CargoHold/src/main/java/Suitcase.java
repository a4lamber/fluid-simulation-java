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

public class Suitcase {
    // attributes
    private ArrayList<Item> items;
    private int maximumTotalWeight;

    // constructors
    
    public Suitcase(int maximumTotalWeight) {
        this.items = new ArrayList<Item>();
        this.maximumTotalWeight = maximumTotalWeight;
    }
    
    
    // methods
    public void addItem(Item item) {
        // 不超重则加一下;
        if (item.getWeight() + this.totalWeight() <= this.maximumTotalWeight) {
            this.items.add(item);
        }
        
    }
    
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item:this.items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Item item:this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        
    if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item:this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() {
        // language formatting this
        String prefix = "";
        String postfix = "items";
        
        if (this.items.isEmpty()) {
//            prefix = "no";
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            postfix = "item";
        } 
            
        prefix = String.valueOf(this.items.size());
        
        return prefix + " " + postfix + " (" + this.totalWeight() + " kg)"; 
    }
}
