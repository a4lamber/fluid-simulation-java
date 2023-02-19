
public class HealthStation {
    // attributes
    private int numberOfWeighings;
    
    // constructor
    public HealthStation() {
        this.numberOfWeighings = 0;
    }
    
    // methods
    public int weigh(Person person) {
        // update the number of weighting this health stations have done;
        this.numberOfWeighings += 1;
        
        // return the weight of the person passed as the parameter
        return person.getWeight();
    }

    
    public void feed(Person person) {
        // modigy person.weight by increasing one
        int weightAfterFeed = person.getWeight() + 1;
        person.setWeight(weightAfterFeed);
        
    }

    // how many weighings the health station has perfomed
    public int weighings() {
        return this.numberOfWeighings;
    }
}
