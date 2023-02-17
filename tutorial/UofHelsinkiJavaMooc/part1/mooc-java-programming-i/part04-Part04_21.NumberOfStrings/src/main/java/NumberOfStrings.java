
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int stringCounter = 0;
        
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            
            stringCounter += 1;
        }
        // end of loop
        System.out.println(stringCounter);
        
    }
}
