
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                
                String[] pieces = row.split(",");
                
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                
                
                String agePlural = "";
                
                if (age == 1) {
                    agePlural = "year"; 
                } else {
                    agePlural = "years";
                }
                
                System.out.println(name + ", ages: " +age + " " + agePlural);
                
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
