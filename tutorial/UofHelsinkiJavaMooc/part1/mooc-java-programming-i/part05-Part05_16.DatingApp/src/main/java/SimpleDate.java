
public class SimpleDate {
    // attributes
    private int day;
    private int month;
    private int year;

    //constructor
    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // methods
    
    public void advance(int howManyDays) {
        /*
        move date by one day assuming each month has 30 day
        also update month and year based on the how date advance
        */
        for (int i = 0; i < howManyDays;i++) {
            advanceHelper();
        }
    }
    
    // helper
    public void advanceHelper() {
        int dayLimit = 30;
        int monthLimit = 12;
        
        this.day += 1;
        
        // 如果大于30天则
        if (this.day > dayLimit) {
            this.day = 1;
            
            // advances month
            this.month += 1;
            
            // advances month by one
            if (this.month > monthLimit) {
                // reset month
                this.month = 1;
                // advance year
                this.year += 1;
            }
        }
    }
    
    // overloaded method
    public void advance() {
        this.advance(1);
    }
    
    
    // 
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate clone = new SimpleDate(this.day,this.month,this.year);
        
        clone.advance(days);
        
        return clone;
    }
    
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
