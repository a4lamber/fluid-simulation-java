/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yixiangzhang
 */
public class Product {
    // define attributes
    private String name;
    private double price;
    private int quantity;
    
    //constructor
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price = initialPrice;
        this.name = initialName;
        this.quantity = initialQuantity;
    }
    
    //method
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
    
    
}
