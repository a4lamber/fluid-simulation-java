
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        
        int input = 0;
        int sum = 0;
        int numberCount = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;
                
        while(true){
            // read input
            input = Integer.valueOf(scanner.nextLine());
            // exit condition
            if (input == -1){
                break;
            }
            /* 
            valid input:
            1. count
            2. sum
            3. check even,odd
            */
            
            numberCount += 1;
            sum += input;
            
            //check even and odd
            if (input % 2 == 0){
                // even
                evenCount += 1;
            } else{
                // odd count
                oddCount +=1;
            }
            
            
        }
        
        // Execution
        System.out.println("Thx!Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberCount);
        average = (double) sum/numberCount;
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        
    }
}
