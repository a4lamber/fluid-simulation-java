
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            // for reading from user
            int input = Integer.valueOf(scanner.nextLine());
            
            // break out of loop when user input 0
            if (input == 0) {
                break;
            }

            // input != 0, accumulate coutner and sum
            counter += 1;
            sum += input;
        }
        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of numbers: " + sum);
    }
}
