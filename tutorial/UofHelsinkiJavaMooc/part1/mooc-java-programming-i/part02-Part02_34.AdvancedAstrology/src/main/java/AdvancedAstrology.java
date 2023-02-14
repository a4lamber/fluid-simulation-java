
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        // 另起一行
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i ++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // edge case
        if (size == 1){
            printStars(1);
            return;
        }
        
        // part 2 of the exercise
        int numberOfSpaces = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(numberOfSpaces);
            printStars(i);            
            //decrease space by one
            numberOfSpaces -= 1;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        // invalid input
        if (height < 3) {
            // invalid input
            return;
        }
        
        // valid input
        //int totalCharactersAtTreeBottom = height * 2 - 1;
        int numberOfStarsRow = 1;
        int numberOfSpacesRow = height - 1;
        
        // top of the tree
        for (int i = 0; i < height; i++){
            printSpaces(numberOfSpacesRow);
            printStars(numberOfStarsRow);
            numberOfSpacesRow -= 1;
            numberOfStarsRow += 2;
        }
        // bottom of the tree
        numberOfSpacesRow = (numberOfStarsRow - 5)/2;
        
        printSpaces(numberOfSpacesRow);
        printStars(3);
        printSpaces(numberOfSpacesRow);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
