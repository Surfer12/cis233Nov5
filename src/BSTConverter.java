import java.util.Arrays;

public class BSTConverter {
    private final int[] originalArray;
    private final int[] sortedArray;
    private TreeNode root;

    public BSTConverter(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        this.originalArray = arr.clone();
        this.sortedArray = arr.clone();
        Arrays.sort(this.sortedArray);
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode convertToBST() {
        return root = arrayToBST(0, sortedArray.length - 1);
    }

    private TreeNode arrayToBST(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(sortedArray[mid]);
        node.left = arrayToBST(left, mid - 1);
        node.right = arrayToBST(mid + 1, right);
        return node;
    }

    public void printTree() {
        System.out.println("\nTree Structure:");
        printTreeStructure(root, "", true);
    }

    private void printTreeStructure(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) return;
        
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);
        
        printTreeStructure(node.left, prefix + (isLeft ? "│   " : "    "), true);
        printTreeStructure(node.right, prefix + (isLeft ? "│   " : "    "), false);
    }

    public int[] getOriginalArray() {
        return originalArray.clone();
    }

    public int[] getSortedArray() {
        return sortedArray.clone();
    }

    public static void main(String[] args) {
        int[] input = {7, 3, 9, 1, 5, 11, 4, 6, 8};
        BSTConverter converter = new BSTConverter(input);
        
        System.out.println("Original array: " + Arrays.toString(converter.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
        
        TreeNode root = converter.convertToBST();
        converter.printTree();
    }
    
    /* Run in VS Code:
    ```bash
    javac InitialArrayv1.java
    java InitialArrayv1
    ```
    
    Expected output:
    ```
    Original array: [7, 3, 9, 1, 5, 11, 4, 6, 8]
    Sorted array: [1, 3, 4, 5, 6, 7, 8, 9, 11]
    
    Tree Structure:
    └── 6
        ├── 3
        │   ├── 1
        │   └── 4
        │       └── 5
        └── 9
            ├── 7
            │   └── 8
            └── 11
    ```
     */
}