/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Archive {
    // attributes
    private String identifier;
    private String name;
    
    // constructors
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    // methods
    
    //
    public boolean equals(Object compared) {
        //
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archive)) {
            return false;
        }
        
        //
        Archive comparedArchive = (Archive) compared;
        
        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }
        
        // otherwise
        return false;
    }
    
    
    // string representation
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
}
