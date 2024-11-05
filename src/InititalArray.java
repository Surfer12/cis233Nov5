import java.util.Arrays;
import javax.swing.tree.TreeNode;

public class InititalArray {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    class node {
        int data;
        node left;
        node right;
    
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
    }
    static class ArraySorter {
        private int[] originalArr;
        private int[] sortedArr;
        private TreeNode root;

        // Change constructor name from SortedArray to ArraySorter
        public ArraySorter(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }    
            this.originalArr = Arrays.copyOf(arr, arr.length);
            this.sortedArr = Arrays.copyOf(arr, arr.length);
        }

        public int[] sortArray() {
            Arrays.sort(originalArr);
            sortedArr = Arrays.copyOf(originalArr, originalArr.length);
            return sortedArr;
        }

        public int[] getOriginalArray() {
            return Arrays.copyOf(originalArr, originalArr.length);
        }

        public int[] getSortedArray() {
            return Arrays.copyOf(sortedArr, sortedArr.length);
        }

        public TreeNode convertToBST() {
            root = sortedArrayToBST(0, sortedArr.length - 1);
            return root;
        }
        
private TreeNode sortedArrayToBST(int start, int end) {
    // Base case: if start > end, we've processed all elements
    if (start > end) return null;
    
    // Find the middle element
    int mid = (start + end) / 2;
    // Create a new node with the middle element
    TreeNode node = new TreeNode(sortedArr[mid]);
    
    // Recursively build left and right subtrees
    node.left = sortedArrayToBST(start, mid - 1);
    node.right = sortedArrayToBST(mid + 1, end);
    
    return node;
}
        // Helper method to print BST in-order
        public void printInOrder() {
            System.out.println("BST In-order traversal:");
            inOrderTraversal(root);
            System.out.println();
        }
        
        private void inOrderTraversal(TreeNode node) {
            if (node == null) return;
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        ArraySorter sorter = new ArraySorter(arr);
        int[] sortedArr = sorter.sortArray();
        System.out.println("Original Array: " + Arrays.toString(sorter.getOriginalArray()));
        System.out.println("Sorted Array: " + Arrays.toString(sorter.getSortedArray()));

        TreeNode root = sorter.convertToBST();
        System.out.println("Root Node: " + root.val);
        sorter.printInOrder();
    }
}
