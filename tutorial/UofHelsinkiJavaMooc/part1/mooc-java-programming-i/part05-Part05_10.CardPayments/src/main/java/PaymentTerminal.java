
public class PaymentTerminal {

    // attributes
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    // constructor
    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }
    
    // methods
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        
        double remainingChange = 0.0;
        
        if (payment >= 2.5) {
            //付钱大于2.5
            remainingChange = payment - 2.5;
            this.affordableMeals += 1;
            this.money += 2.5;
        } else {
            // 付钱少于2.5
            remainingChange = payment;
        }
        
        return remainingChange;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double remainingChange = 0.0;
        
        if (payment >= 4.3) {
            //付钱大于4.3
            remainingChange = payment - 4.3;
            this.heartyMeals += 1;
            this.money += 4.3;
        } else {
            // 付钱少于4.3
            remainingChange = payment;
        }
        
        return remainingChange;
    }
    
    // methods for taking card payment, overloaded one, 用卡买，register里的钱不会增加
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 2.5) {
            // can afford it
            //this.money += 2.5;
            this.affordableMeals += 1;
            card.takeMoney(2.5);
            
            return true;
        } else {
            // can't afford it
            
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() >= 4.3) {
            // can afford it
            // this.money += 4.3;
            this.heartyMeals += 1;
            card.takeMoney(4.3);
            
            return true;
        } else {
            // can't afford it
            
            return false;
        }
    }
    
    // class
    public void addMoneyToCard(PaymentCard card, double sum) {
        //
        if (sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
