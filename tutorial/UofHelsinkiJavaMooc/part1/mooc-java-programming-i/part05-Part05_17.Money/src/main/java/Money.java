
public class Money {
    /*
    attributes
    final keyword is for
    */
    private final int euros;
    private final int cents;

    // constructor
    public Money(int euros, int cents) {
        // floor devision + modulus for the digit
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    // methods
    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros() + addition.euros(),
                                   this.cents() + addition.cents()); 

        // return the new Money object
        return newMoney;
    }
    
    public Money minus(Money decreaser) {
        /*
        1. compare the differecnce in both euros and cents
        情况1: euro为负数，reset
        情况2: euro为0，cents为负数 rest
        情况3: call plus here.
        */
        int eurosDifference = this.euros() - decreaser.euros();
        int centsDifference = this.cents() - decreaser.euros();
        
        //情况1
        if (eurosDifference < 0) {
            Money newMoney = new Money(0,0);
            return newMoney;
        }
        //情况2
        if (eurosDifference == 0 && centsDifference < 0) {
            Money newMoney = new Money(0,0);
            return newMoney;
        }
        
        //情况3.1 被减数的分 >= 减数;
        if (this.cents() >= decreaser.cents()) {
            Money newMoney = new Money(this.euros() - decreaser.euros(),
                  this.cents() - decreaser.cents());
            
            return newMoney;
        }
        
        // 情况3.2: otherwise要进位, 1 euro转化为100 cents
        Money newMoney = new Money(this.euros() - decreaser.euros() - 1,
        100 + this.cents() - decreaser.cents());

 
        return newMoney;
    }    
    
    public boolean lessThan(Money compared) {
        /*
        两种情况: 
        1. euro直接就比较少
        2. euro相等，cens比较少
        */
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
            
        }
        
        // otherwise
        return false;
    }
    
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
