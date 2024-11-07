import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputValues = { 50, 20, 70, 10, 60, 30, 40, 80 };
        BinarySearchTreeConverter bstConverter = new BinarySearchTreeConverter(inputValues);

        System.out.println("Original array: " + Arrays.toString(bstConverter.getInputArray()));
        System.out.println("Sorted array: " + Arrays.toString(bstConverter.getSortedArray()));

        Node root = bstConverter.buildBinarySearchTree();
        bstConverter.printTree();

        Tree tree = new Tree(root);

        System.out.println("\nIn-order Traversal:");
        tree.inOrderTraversal();

        System.out.println("\nPre-order Traversal:");
        tree.preOrderTraversal();

        System.out.println("\nPost-order Traversal:");
        tree.postOrderTraversal();
    }
}
