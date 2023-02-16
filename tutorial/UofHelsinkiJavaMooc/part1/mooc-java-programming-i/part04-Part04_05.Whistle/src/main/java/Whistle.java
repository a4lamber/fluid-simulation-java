/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Whistle {
    // attributes
    private String sound;
    
    // constructor
    public Whistle(String initialSound){
        this.sound = initialSound;
    }
    
    // method
    public void sound(){
        System.out.println(this.sound);
    }
            
}
