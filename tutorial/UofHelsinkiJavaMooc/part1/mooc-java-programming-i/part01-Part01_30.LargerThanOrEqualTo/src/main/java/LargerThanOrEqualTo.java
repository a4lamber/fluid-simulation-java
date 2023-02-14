
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        String outputString = "Greater number is: ";

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        } else if (firstNumber > secondNumber) {
            System.out.println(outputString + firstNumber);
        } else {
            System.out.println(outputString + secondNumber);
        }

    }
}
