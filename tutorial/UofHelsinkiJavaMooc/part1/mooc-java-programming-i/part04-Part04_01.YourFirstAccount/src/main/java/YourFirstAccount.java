
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account adamAccount = new Account("Adam's account",100.0);
        
        adamAccount.deposit(20);
        System.out.println(adamAccount.balance);
    }
}

