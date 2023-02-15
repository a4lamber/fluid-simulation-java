
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // check for empty line
        while (true) {
            String line = scanner.nextLine();
            
            // jump out conditon
            if (line.isEmpty()) {
                break;
            }
            
            // split it up and print
            String[] pieces = line.split(" ");
            for (int i = 0; i<pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            
        }
        
        
        

    }
}
