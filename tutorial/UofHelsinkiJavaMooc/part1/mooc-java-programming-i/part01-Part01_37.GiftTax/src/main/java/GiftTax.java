
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // read user input
        System.out.println("value of the gift?");
        // value of the gift
        int giftValue = Integer.valueOf(scan.nextLine());

        double taxAtLowerLimit = 0;
        double taxAmountRate = 0;
        double taxTotal = 0;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            taxAtLowerLimit = 100;
            taxAmountRate = 0.08;
            taxTotal = taxAtLowerLimit + (giftValue - 5000) * taxAmountRate;

            System.out.println("Tax: " + taxTotal);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            taxAtLowerLimit = 1700;
            taxAmountRate = 0.1;
            taxTotal = taxAtLowerLimit + (giftValue - 25000) * taxAmountRate;

            System.out.println("Tax: " + taxTotal);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            taxAtLowerLimit = 4700;
            taxAmountRate = 0.12;
            taxTotal = taxAtLowerLimit + (giftValue - 55000) * taxAmountRate;

            System.out.println("Tax: " + taxTotal);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            taxAtLowerLimit = 22100;
            taxAmountRate = 0.15;
            taxTotal = taxAtLowerLimit + (giftValue - 200000) * taxAmountRate;

            System.out.println("Tax: " + taxTotal);
        } else if (giftValue >= 100000) {
            taxAtLowerLimit = 142100;
            taxAmountRate = 0.17;
            taxTotal = taxAtLowerLimit + (giftValue - 1000000) * taxAmountRate;

            System.out.println("Tax: " + taxTotal);
        }
        
    }
}
