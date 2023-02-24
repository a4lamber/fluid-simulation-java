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
import java.util.ArrayList;

public class VehicleRegistry {
    // attributes
    private HashMap<LicensePlate,String> plateToOwner;
    
    // constructors
    public VehicleRegistry() {
        this.plateToOwner = new HashMap<>();
    }
        
    // methods
    public boolean add(LicensePlate licensePlate, String owner) {
        if (plateToOwner.containsKey(licensePlate)) {
            // it exists
            return false;
        }
        
        this.plateToOwner.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.plateToOwner.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.plateToOwner.containsKey(licensePlate)) {
            this.plateToOwner.remove(licensePlate);
            return true;
        }
        // not found
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate:this.plateToOwner.keySet()) {
            System.out.println(plate);
        }
    }
    
    // this should be printing unique owners
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner:this.plateToOwner.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
