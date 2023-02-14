
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        
        int userInput = 0;
        
        while (true){
            System.out.println("Give a number:");
            userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }
            
            counter += 1;
            sum += userInput;
        }
        
        double avg = sum/counter;
        System.out.println("Average of the numbers: " + avg);
        
               
    }
}
