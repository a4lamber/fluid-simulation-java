
public class Apartment {
    // attributes
    private int rooms;
    private int squares;
    private int princePerSquare;

    // constructor
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    // methods
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        //
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int difference = this.squares * this.princePerSquare - compared.squares * compared.princePerSquare;
        
        if (difference < 0) {
            return -1 * difference;
        }
        
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int difference = this.squares * this.princePerSquare - compared.squares * compared.princePerSquare;
        
        if (difference <= 0) {
            return false;
        }
        
        return true;
    }
}