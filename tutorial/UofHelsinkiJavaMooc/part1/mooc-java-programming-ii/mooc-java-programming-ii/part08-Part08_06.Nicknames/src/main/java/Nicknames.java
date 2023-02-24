
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> names = new HashMap<>();
        
        names.put("matthew", "matt");
        names.put("michale", "mix");
        names.put("arthur", "artie");
        
        // get mattew
        System.out.println(names.get("matthew"));
    }

}
