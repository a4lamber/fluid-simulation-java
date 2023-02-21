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

public class Room {
    // attributes
    private ArrayList<Person> persons = new ArrayList<>();
    
    // constructor
    public Room() {
        this.persons = new ArrayList<Person>();
    }
    
    // methods
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (this.persons.size() == 0) {
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        /*
        return a list of persons in order
        */
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person shortestInTheRoom = this.persons.get(0);
        
        for (Person person:this.persons) {
            if (person.getHeight() < shortestInTheRoom.getHeight()) {
                shortestInTheRoom = person;
            }
        }
        
        return shortestInTheRoom;
    }
    
    
    public Person take() {
        
        if (this.isEmpty()) {return null;}
        // declare the person to take
        Person outputPerson = this.shortest();
        // remove this guy from the arraylist
        
        for (int i = 0; i < this.persons.size(); i++) {
            if (this.persons.get(i).equals(outputPerson)) {
                this.persons.remove(i);
                break;
            }
        }
        // end of loop, time to return;
        return outputPerson;
        
    }
}


