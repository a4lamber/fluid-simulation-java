
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        
        //
        while (true) {
            String input = scanner.nextLine();
            // invalid handlement
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        // retrieve the thirs element in the list
        System.out.println(list.get(2));
    }
}
