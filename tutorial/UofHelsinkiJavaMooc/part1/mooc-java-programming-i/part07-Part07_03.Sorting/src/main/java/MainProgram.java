import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        // return the smallest element in the array
        int smallest = array[0];
        
        for (int number:array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest = array[0];
        int smallestIndex = 0;
        
        for (int i = 0; i < array.length; i ++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        } 
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
    
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        
        for (int i = startIndex; i < table.length; i ++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        } 
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        if (index1 >= array.length || index2 >= array.length) {
            // do nothing, index out of range
            return;
        }
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    // part 5: selection sorting, O(n^2)
    public static void sort(int[] array) {
        /*
        Procedure:
        find the smallest, swap it with index 0;
        find the smallest from index 1, swap it with index 1;
        find the smallest from index 2, swap it with index 2;
        */
        
        // 只需要做n-1次
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int currentSmallest = MainProgram.indexOfSmallestFrom(array,i);
            MainProgram.swap(array, i, currentSmallest);
            System.out.println(Arrays.toString(array));
        }
        
    }

}
