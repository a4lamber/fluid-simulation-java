
import java.util.ArrayList;

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

public class TodoList {
        // attributes
    private ArrayList<String> list;
    
    // constructor
    public TodoList() {
        this.list = new ArrayList<String>();
    }
    
    // methods
    public void add(String task) {
        list.add(task);
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
    
    public void print() {
        // to-do list is 1-index while code is 0-indexed 
        for (int i = 0; i < list.size();i++) {
            System.out.println( i+1 + ": " + list.get(i));
        }
    }
}



