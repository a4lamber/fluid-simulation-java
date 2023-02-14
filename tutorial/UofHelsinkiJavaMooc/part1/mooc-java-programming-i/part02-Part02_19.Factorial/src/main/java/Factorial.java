
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        // checking for edge cases
        if (input == 0){
            System.out.println("Factorial: " + factorial);
            return;
        }
        
        // 
        for (int i = 1;i <= input;i++){
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
        
        
    }
}
