
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // create a list of archive
        ArrayList<Archive> archives = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String userIdentifier = scanner.nextLine();
            if (userIdentifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String userName = scanner.nextLine();
            
            if (userName.isEmpty()){
                break;
            }
            // end of user input, not append
            Archive archive = new Archive(userIdentifier,userName);
            
            boolean isDuplicate = false;
            
            for (Archive thisArchive:archives) {
                if (archive.equals(thisArchive)) {
                    isDuplicate = true;
                }
            }
            
            if (!isDuplicate) {
                archives.add(archive);
            }
        }
        
        // end of loop
        for (Archive archive:archives) {
            System.out.println(archive);
        }
    }
}
