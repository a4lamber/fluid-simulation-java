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
import java.util.HashMap;

public class StorageFacility {
    // attributes
    private HashMap<String,ArrayList<String>> storage;
    // stuff like that
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    // methods
    public void add(String unit, String item) {
        if (!this.storage.containsKey(unit)) {
            // doesn't contains the key
            ArrayList<String> items = new ArrayList<>();
            items.add(item);
            this.storage.put(unit, items);
            return;
        }
        // does contain the key "unit"
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!this.storage.containsKey(storageUnit) || this.storage.get(storageUnit).isEmpty()) {
            return new ArrayList<String>();
        }
        return this.storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit) && this.storage.get(storageUnit).contains(item)) {
            // 如果存在这个unit, 且这个unit中存在这个item, remove the 1st occurence
            this.storage.get(storageUnit).remove(item);
        }
        
        if (this.storage.get(storageUnit).isEmpty()) {
            // check if unit is empty after previous removal;
            // if yes, then we we remove the unit
            this.storage.remove(storageUnit);
        }
        // else do nothing
    }
    
    public ArrayList<String> storageUnits() {
        // 
        ArrayList<String> nonEmptyUnits = new ArrayList<>(); 
        
        for (String unit:this.storage.keySet()) {
            if (!this.storage.get(unit).isEmpty()) {
                nonEmptyUnits.add(unit);
            }
        }
        
        return nonEmptyUnits;
    }
}

