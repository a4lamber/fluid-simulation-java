
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCounter = 0;
        double positiveSum = 0;
        int userInput = 0;
        
        while (true){
            userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 0){
                break;
            }
            
            if (userInput > 0){
                positiveCounter += 1;
                positiveSum += userInput;
            }
        }
    
        if (positiveCounter == 0){
            System.out.println("Cannot calculate the average");
        }
        
        double avg = positiveSum/positiveCounter;
        System.out.println(avg);
    }
}
