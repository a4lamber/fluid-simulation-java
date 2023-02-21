
import java.util.ArrayList;

public class SimpleCollection {
    // attributes
    private String name;
    private ArrayList<String> elements;

    // constructor
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    // methods
    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        /*
        return the longest string
        1. check for emptiness
        2. create an output onject
        3. 打擂台
        */
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String outputString = this.elements.get(0);
        
        for (String element:this.elements) {
            if (outputString.length() < element.length()) {
                outputString = element;
            }
        }
        // end of loop
        return outputString;
    }

}
