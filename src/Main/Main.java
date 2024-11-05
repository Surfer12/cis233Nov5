import Classes.BSTConverter;
import Classes.Tree;
import java.util.Arrays; // Added missing import

public class Main {
    public static void main(String[] args) throws Exception {
        // ...existing code...
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.inOrderTraversal();
        
        // ...existing code...
        int[] input = {10, 20, 30, 40, 50, 60, 70};
        BSTConverter converter = new BSTConverter(input);
        
        System.out.println("\nOriginal array: " + Arrays.toString(converter.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
        
        // ...existing code...
        converter.printTree();
    }
}
