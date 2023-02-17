
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        
        String userInputFilename = scanner.nextLine();
        
        try (Scanner scanner2 = new Scanner(Paths.get(userInputFilename))) {
            while (scanner2.hasNextLine()) {
                String row = scanner2.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
