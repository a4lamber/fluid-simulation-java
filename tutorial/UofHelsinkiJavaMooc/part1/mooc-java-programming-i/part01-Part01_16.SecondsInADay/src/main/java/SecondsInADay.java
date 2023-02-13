
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        /*
        1
        86400
        */
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDay = Integer.valueOf(scanner.nextLine());
        int dayInSeconds = numberOfDay * 24 * 3600;
        System.out.println(dayInSeconds);
    }
}
