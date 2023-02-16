
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String line = scanner.nextLine();
            
            //hanlde empty line
            if (line.isEmpty()) {
                break;
            }
            
            //
            String[] words = line.split(" ");
            System.out.println(words[0]);
        }
       
    }
}
