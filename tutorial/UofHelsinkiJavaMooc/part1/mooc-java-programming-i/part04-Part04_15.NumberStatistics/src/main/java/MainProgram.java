
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        // Part 2 test
//        Statistics statistics = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        
        
        // Part 3 Sum of user input
        
        Statistics statistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true) {
            
            int line = Integer.valueOf(scanner.nextLine());
            
            if (line == -1) {
                break;
            }
            
            // add value to the stat class
            statistics.addNumber(line);
            
            if (line%2 == 0) {
                evenStatistics.addNumber(line);
            } else {
                oddStatistics.addNumber(line);
            }
        }
        
        // outside of the loop
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}
