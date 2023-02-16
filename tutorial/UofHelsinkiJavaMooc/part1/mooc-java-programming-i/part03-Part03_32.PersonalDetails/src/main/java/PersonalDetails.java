
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static double agesAverage(ArrayList<Integer> ages) {
        double averageAge = 0.0;
        
        for (int i = 0; i < ages.size();i++) {
            averageAge += ages.get(i);
        }
        
        averageAge = 1.0 * averageAge/ages.size();
        
        return averageAge;
    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        
        ArrayList<Integer> ages = new ArrayList<>();
                
        while (true) {
            // 
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            //
            String[] wordsInLine = line.split(",");
            //
            ages.add(Integer.valueOf(wordsInLine[1]));
            //
            if (wordsInLine[0].length() > longestName.length()) {
                longestName = wordsInLine[0];
            }            
        }
        //
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + agesAverage(ages));
        
    }
}
