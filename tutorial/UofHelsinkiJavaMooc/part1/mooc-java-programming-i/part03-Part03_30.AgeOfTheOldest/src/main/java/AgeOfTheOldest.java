
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        
        while(true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            
            String[] wordsInLine = line.split(",");
            
            int currentAge = Integer.valueOf(wordsInLine[1]);
            
            if (currentAge > oldestAge) {
                oldestAge = currentAge;
            }
        }
        // outside of the loop
        System.out.println("Age of the oldest: " + oldestAge);
        
    }
}
