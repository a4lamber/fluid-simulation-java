
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String id = scanner.nextLine();

            // construct a new personal information variable
            PersonalInformation info = new PersonalInformation(firstName, lastName, id);

            infoCollection.add(info);

        }
        // end of loop
        
        System.out.println(" ");
        for (PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }

    }
}
