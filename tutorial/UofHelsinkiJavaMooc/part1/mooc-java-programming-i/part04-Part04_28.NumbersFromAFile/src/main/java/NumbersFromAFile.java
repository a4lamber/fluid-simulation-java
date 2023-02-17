
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // Start reading
        int numberInRangeCounter = 0;
        
        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                int number = Integer.valueOf(scannerFile.nextLine());
                
                if (number >= lowerBound && number <= upperBound) {
                    numberInRangeCounter +=1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
        // end
        System.out.println("Numbers: " + numberInRangeCounter);
    
    }

}
