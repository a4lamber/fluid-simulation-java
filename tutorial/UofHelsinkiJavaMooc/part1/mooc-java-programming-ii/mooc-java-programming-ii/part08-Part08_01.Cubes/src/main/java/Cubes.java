
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                return;
            }
            int userInputInteger = Integer.valueOf(userInput);
            
            System.out.println(userInputInteger * userInputInteger * userInputInteger);
        }
        // end of loop
    }
}
