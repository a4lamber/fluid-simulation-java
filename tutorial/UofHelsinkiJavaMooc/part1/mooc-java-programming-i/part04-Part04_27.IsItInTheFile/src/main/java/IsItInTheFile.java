
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.equals(searchedFor)) {
                    System.out.println("Found!");
                    return;
                }
            }
            // end of the loop
            System.out.println("Not found!");
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        
        
        

    }
}
