import java.util.Arrays;
import javax.swing.tree.TreeNode;

public class InititalArray {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
    static class ArraySorter {
        private int[] originalArr;
        private int[] sortedArr;

        public SortedArray(int[] arr) {
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
            return root = sortedArrayToBST(0, sortedArr.length - 1/ 2);
        }

        private TreeNode sortedArrayToBST(int start, int end) {
            if (start > end) return null;
            
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(sortedArr[mid]);
            
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
        
        public int[] getOriginalArray() {
            return Arrays.copyOf(originalArr, originalArr.length);
        }
        
        public int[] getSortedArray() {
            return Arrays.copyOf(sortedArr, sortedArr.length);
        }
    }
    


    // Impliment the grabbing of sorted array to create tree
    // Grab the middle element of the sorted array to create the root node with a method that returns the root node
    // Grab the left half of the array to create the left subtree with a method that returns the left subtree
    // Grab the right half of the array to create the right subtree with a method that returns the right subtree
    // Check the left and right elements of each element on each side of the  tree to create the balanced tree with a method that checks during the creation of the left and right subtrees
    

        public Node createBST(int[] sortedArray) {
            if (sortedArray == null || sortedArray.length == 0) {
                return null;
            }
            return buildTree(sortedArray, 0, sortedArray.length - 1);
        }

        private Node buildTree(int[] sortedArray, int start, int end) {
            if (start > end) {
                return null;
            }

            int mid = (start + end) / 2;
            Node node = new Node(sortedArray[mid]);

            node.left = buildTree(sortedArray, start, mid - 1);
            node.right = buildTree(sortedArray, mid + 1, end);

            return node;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        ArraySorter sorter = new ArraySorter(arr);
        int[] sortedArr = sorter.sortArray();
        System.out.println("Original Array: " + Arrays.toString(sorter.getOriginalArray()));
        System.out.println("Sorted Array: " + Arrays.toString(sorter.getSortedArray()));

        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.createBST(sortedArr);
        System.out.println("Root Node: " + root.value);
    }
}
