/* // Sorted Array to Balanced BST
// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
// use a recursive approach to solve this problem
// Find the middle element of the array and make it the root of the Binary seach tree
// recursively construct the left subtree and right subtree

// Sorted Array to Balanced BST
// Given an array where elements are may or may not be sorted in ascending order, sort it and  convert it to a height balanced BST.
// Find the middle element of the array and make it the root of the tree. Then, recursively construct the left and right halves of the tree.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Re-add the main method to execute the program using the consolidated Tree class
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.inOrderTraversal();
        
        // Optionally, demonstrate array to BST conversion
        int[] input = {10, 20, 30, 40, 50, 60, 70};
        BSTConversion.BSTConverter converter = new InitialArrayv1.BSTConverter(input);
        
        System.out.println("\nOriginal array: " + Arrays.toString(converter.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
        
        InitialArrayv1.TreeNode root = converter.convertToBST();
        converter.printTree();
    }
}
