
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        //check memory locaiotn
        if (this == compared) {
            return true;
        }
        // check data type
        if (!(compared instanceof Person)) {
            return false;
        }
        
        // chevk every attributes
        Person comparedPerson = (Person) compared;
        
        if (this.name == comparedPerson.name &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight) {
        return true;
    }
        
        // otherwise these two are not equal
        return false;
    }
    
}
