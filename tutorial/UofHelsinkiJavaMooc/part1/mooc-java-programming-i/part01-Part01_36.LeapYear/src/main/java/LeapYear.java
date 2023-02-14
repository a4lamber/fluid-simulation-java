
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());

        // Approach 1: brute force, it ranks from most demanding to less demanding
//        if (year % 400 == 0 && year % 100 == 0) {
//            System.out.println("The year is a leap year.");
//        } else if (year % 4 == 0 && year % 100 != 0) {
//            System.out.println("The year is a leap year.");
//        } else if (year % 100 == 0) {
//            System.out.println("The year is not a leap year.");
//        } else if (year % 4 == 0) {
//            System.out.println("The year is a leap year.");
//        } else {
//            System.out.println("The year is not a leap year.");
//        }
        
        // Approach 2: grouping demanding results together;
        if ((year % 400 == 0 && year % 100 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        } 
        
    }
}
