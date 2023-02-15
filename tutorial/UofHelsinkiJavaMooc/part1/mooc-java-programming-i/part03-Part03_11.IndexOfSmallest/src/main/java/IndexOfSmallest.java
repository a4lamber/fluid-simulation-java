
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == 9999) {
                break;
            }
            // valid input
            list.add(userInput);
        }
        
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestInList = list.get(0);
        ArrayList<Integer> indexList = new ArrayList<>();
        
        // search for smallest value
        for (int i =0; i<list.size();i++) {
            if (list.get(i) < smallestInList ) {
                smallestInList = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallestInList);
        
        for (int i = 0; i<list.size();i++) {
            if (list.get(i) == smallestInList) {
                indexList.add(list.get(i));
                System.out.println("Found at index: " + i);
            }
        }
        
        
        
        
        
    }
}
