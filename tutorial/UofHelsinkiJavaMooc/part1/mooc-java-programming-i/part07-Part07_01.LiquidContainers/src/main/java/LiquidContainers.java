// procedural programming的解法

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer first = 0;
        Integer second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                // dont'a handle negative input
                continue;
            }
            
            if (command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
                continue;
            }

            if (command.equals("move")) {
                // 第一个水箱不够move的话
                if (first - amount < 0) {
                    amount = first;
                }

                // 第一个水箱不满的情况
                first -= amount;
                second += amount;
                if (second > 100) {
                    second = 100;
                }
                continue;
            }
            // remove command
            if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
                continue;
            }

        }
    }

}
