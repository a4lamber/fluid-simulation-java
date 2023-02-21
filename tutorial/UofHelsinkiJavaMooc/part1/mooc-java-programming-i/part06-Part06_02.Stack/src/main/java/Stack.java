/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author yixiangzhang
 */
public class Stack {
    // stack有两种implementaion方式，array or linked list, 这里是array implementation
    
    // attributes
    private ArrayList<String> values;
    
    // constructors
    public Stack() {
        this.values = new ArrayList<>();
    }
     
    
    // methods
    public boolean isEmpty() {
        return this.values.isEmpty();
    }
    
    
    public void add (String value) {
        // insert at the 0th position of the array to emulate stack, O(n)
        // 如果用linked list implement stack会是O(1)
        this.values.add(0,value);
    }
    
    
    public ArrayList<String> values() {
        return this.values;
    }
    
    public String take() {
        String topElement = this.values.get(0);
        // remove it 
        this.values.remove(0);
        
        return topElement;
    }
    
}
