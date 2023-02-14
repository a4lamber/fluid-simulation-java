
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]");
        int grade = Integer.valueOf(scan.nextLine());

        String outputString = "Grade: ";

        if (grade > 100) {
            System.out.println("incredible!");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println(outputString + "5");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println(outputString + "4");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println(outputString + "3");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println(outputString + "2");
        } else if (grade >= 50 && grade <= 59) {
            System.out.println(outputString + "1");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println(outputString + "failed");
        } else {
            System.out.println(outputString + "impossible!");
        }

    }
}
