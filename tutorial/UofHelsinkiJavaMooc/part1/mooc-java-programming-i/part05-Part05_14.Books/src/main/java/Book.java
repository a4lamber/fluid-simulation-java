
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    // methods
    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        /*
        compare memory locaiton
        compare isinstance of ?
        compare every attributes
        */
        
        if (this == compared) {
            return true;
        } 
        
        // 比较是否属于同一个class, 而且肩负着让object能access到attributes的使命;
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // 比较every attributes
        Book comparedBook = (Book) compared;
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear)
        {
            return true;
        }
        // otherwise, return false
        return false;
    }

}
