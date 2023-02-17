import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                //
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int publicationYears = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(title, pages,publicationYears);
            // append it to the list
            books.add(book);
        }
        
        // end of loop
        System.out.print("What information will be printed?");
        String userPrintCommand = scanner.nextLine();
        
        for (Book book:books) {
            book.printBook(userPrintCommand);
        }
    }
}
