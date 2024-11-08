import java.util.Arrays;

public class BinarySearchTreeConverter {
    private final int[] inputArray;
    private final int[] sortedArray;
    private Node root; 

    public BinarySearchTreeConverter(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        this.inputArray = arr.clone();
        this.sortedArray = arr.clone();
        Arrays.sort(this.sortedArray);
    }

    private Node buildBSTFromArray(int left, int right) {
        if (left > right) return null;
        int mid = (left + right) / 2;
        Node node = new Node(sortedArray[mid]);
        node.setLeft(buildBSTFromArray(left, mid - 1));
        node.setRight(buildBSTFromArray(mid + 1, right));
        return node;
    }
    
    public Node buildBinarySearchTree() {
        return root = buildBSTFromArray(0, sortedArray.length - 1); 
    }

        public void printTree() {
        System.out.println("\nTree Structure:");
        printTreeStructure(root, 0);
    }

      private void printTreeStructure(Node node, int level) {
        if (node == null) return;
    
        printTreeStructure(node.getRight(), level + 1);
    
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.getValue());
    
        printTreeStructure(node.getLeft(), level + 1);
    }
    public int[] getInputArray() {
        return inputArray.clone();
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