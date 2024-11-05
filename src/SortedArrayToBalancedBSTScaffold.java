class Node {
    int data;
    Node left, right;
    
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;
    
    BinarySearchTree() {
        root = null; 
    }
    
    Node sortedArrayToBST(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        // First sort the array
        Arrays.sort(arr);
        
        return sortedArrayToBSTUtil(arr, 0, arr.length - 1);
    }
    
    Node sortedArrayToBSTUtil(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        
        node.left = sortedArrayToBSTUtil(arr, start, mid - 1);
        node.right = sortedArrayToBSTUtil(arr, mid + 1, end);
        
        return node;
    }
}

public class SortedArrayToBalancedBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        tree.root = tree.sortedArrayToBST(arr);
    }
}