
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String oldestName = "dummy";
        int oldestAge = 0;
        
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            
            // 
            String[] wordsInLine = line.split(",");
            
            int currentAge = Integer.valueOf(wordsInLine[1]);
            
            if (currentAge > oldestAge) {
                // update age
                oldestAge = currentAge;
                //update name
                oldestName = wordsInLine[0];
            }
        }
            System.out.println("Name of the oldest: " + oldestName);
    }
}
