import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] input = {50, 20, 70, 10, 60, 30, 40, 80};
            BSTConverter converter = new BSTConverter(input);
    
            System.out.println("Original array: " + Arrays.toString(converter.getOriginalArray()));
            System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
    
            Node root = converter.convertToBST();
            converter.printTree();
        }
    }
