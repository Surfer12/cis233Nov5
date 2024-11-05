
import java.util.Arrays; // Added missing import


public class Main {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50, 60, 70};
            BSTConverter converter = new BSTConverter(input);
    
            System.out.println("Original array: " + Arrays.toString(converter.getOriginalArray()));
            System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
    
            Node root = converter.convertToBST();
            converter.printTree();
        }
    }
