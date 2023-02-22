
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second= new Container();
        
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                first.add(amount);
            }
            
            if (command.equals("remove")) {
                second.remove(amount);
            }
            
            if (command.equals("move")) {
                // 第一个水箱水不够转移时;
                if (amount > first.contains()) {
                    // update转移的amount
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            }
        }
    }

}
