
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            
            // print it up
            String[] pieces = line.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
            }
        
        }
        
    }
}
