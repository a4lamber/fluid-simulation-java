
import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> strings) {
        // doesn't do anything if it is empty
        if (strings.isEmpty()) {
            return;
        }
        
        
        strings.remove(strings.size() -1);
    }
    
    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

}
