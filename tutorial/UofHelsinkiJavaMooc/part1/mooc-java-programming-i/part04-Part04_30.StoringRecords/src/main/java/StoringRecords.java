
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        // 创建一个ArrayList, 放满person;
        
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        // Write here the code for reading from file
        // and printing the read records
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            // 判断是否还有数据, 如果有继续读直到没有
            while (scanFile.hasNextLine()) {
                //
                String line = scanFile.nextLine();
                // split the line with delimiter ,
                String[] parts = line.split(",");
                
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                        
                // initialize a person object
                Person person = new Person(name,age);
                
                // append person to a list of person
                persons.add(person);   
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;

    }
}
