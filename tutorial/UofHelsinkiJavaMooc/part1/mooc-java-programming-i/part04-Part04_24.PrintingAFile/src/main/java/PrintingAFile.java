
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
       try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
           // 读取成功
           while (scanner.hasNextLine()) {
               // we read one line
               String row = scanner.nextLine();
               // we print the line we read
               System.out.println(row);
           }
           
       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       } 
       
    }
}
