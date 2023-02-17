
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            }
            
            // add a new item
            Item currentItem = new Item(line);
            
            items.add(currentItem);
            
            System.out.print("Name: " + currentItem.getName());
            System.out.println("");
        }
        // input done!
        for (Item item : items) {
            System.out.println(item);
        }
        
        
    }
}
