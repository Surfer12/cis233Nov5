

import java.util.Arrays;

public class BSTConverter {
    private final int[] originalArray;
    private final int[] sortedArray;
    private Node root;

    public BSTConverter(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        this.originalArray = arr.clone();
        this.sortedArray = arr.clone();
        Arrays.sort(this.sortedArray);
    }

    public Node convertToBST() {
        return root = arrayToBST(0, sortedArray.length - 1);
    }

    private Node arrayToBST(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        Node node = new Node(sortedArray[mid]);
        node.setLeft(arrayToBST(left, mid - 1));
        node.setRight(arrayToBST(mid + 1, right));
        return node;
    }

    public void printTree() {
        System.out.println("\nTree Structure:");
        printTreeStructure(root, "", true);
    }

    private void printTreeStructure(Node node, String prefix, boolean isLeft) {
        if (node == null) return;

        System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());

        printTreeStructure(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
        printTreeStructure(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
    }

    public int[] getOriginalArray() {
        return originalArray.clone();
    }

    public int[] getSortedArray() {
        return sortedArray.clone();
    }

   
    /*
    
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