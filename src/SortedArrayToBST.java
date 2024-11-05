/* # Plan for Sorted Array to Balanced BST

## Steps
1. Create TreeNode class
2. Create ArrayToBST class
3. Implement sorting and conversion methods
4. Add helper methods for BST operations
5. Add testing/visualization
 */
import java.util.Arrays;
public class SortedArrayToBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    static class ArrayConverter {
        private int[] originalArr;
        private int[] sortedArr;
        private TreeNode root;
        
        public ArrayConverter(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            this.originalArr = Arrays.copyOf(arr, arr.length);
            this.sortedArr = Arrays.copyOf(arr, arr.length);
            Arrays.sort(this.sortedArr);
        }
        
        public TreeNode convertToBST() {
            return root = sortedArrayToBST(0, sortedArr.length - 1);
        }
        
    public static void main(String[] args) {
        int[] arr = {80, 70, 60, 50, 40, 30};
        ArrayConverter converter = new ArrayConverter(arr);
        
        System.out.println("Original array: " + Arrays.toString(converter.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(converter.getSortedArray()));
        
        converter.convertToBST();
        converter.printInOrder();
    }
}


/* To run:
1. Save as `SortedArrayToBST.java`
2. In VS Code terminal:
```bash
javac SortedArrayToBST.java
java SortedArrayToBST
```

Expected output:
```
Original array: [80, 70, 60, 50, 40, 30]
Sorted array: [30, 40, 50, 60, 70, 80]
BST In-order traversal:
30 40 50 60 70 80
```

The resulting BST will be height-balanced with minimal height. */
private TreeNode sortedArrayToBST(int start, int end) {
    if (start > end) return null;
    
    int mid = (start + end) / 2;
    TreeNode node = new TreeNode(sortedArr[mid]);
    
    node.left = sortedArrayToBST(start, mid - 1);
    node.right = sortedArrayToBST(mid + 1, end);
    
    return node;
}

public int[] getOriginalArray() {
    return Arrays.copyOf(originalArr, originalArr.length);
}

public int[] getSortedArray() {
    return Arrays.copyOf(sortedArr, sortedArr.length);
}

public void printInOrder() {
    System.out.println("BST In-order traversal:");
    printInOrder(root);
    System.out.println();
}

private void printInOrder(TreeNode node) {
    if (node == null) return;
    printInOrder(node.left);
    System.out.print(node.val + " ");
    printInOrder(node.right);
}
    }