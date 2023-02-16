
        

public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the 
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }

    /*
    int getCount():
    int sum():
    int average():
     */
    public int getCount() {
        // 
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        // catch empty 
        if (this.count == 0) {
            return 0;
        }
        
        return 1.0 * this.sum / this.count;
    }

}
