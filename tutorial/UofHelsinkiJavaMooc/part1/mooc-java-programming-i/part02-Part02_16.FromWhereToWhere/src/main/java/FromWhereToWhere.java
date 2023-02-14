
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?");
        int upperBound = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from?");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        if (lowerBound > upperBound) {
            return;
        }

        for (int i = lowerBound; i <= upperBound; i++) {
            System.out.println(i);
        }
    }
}
