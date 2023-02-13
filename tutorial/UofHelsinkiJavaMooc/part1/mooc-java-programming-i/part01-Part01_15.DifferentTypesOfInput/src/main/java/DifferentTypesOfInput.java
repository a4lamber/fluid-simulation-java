
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String messageString = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int messageInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double messageDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean messageBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + messageString);
        System.out.println("You gave the integer " + messageInteger);
        System.out.println("You gave the double " + messageDouble);
        System.out.println("You gave the boolean " + messageBoolean);
    }
}
