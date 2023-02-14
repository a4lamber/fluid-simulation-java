
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = userInput; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
