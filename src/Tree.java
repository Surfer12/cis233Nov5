public class Tree {
    private Node root;

    public void insert(int value) { // Renamed parameter from data to value
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) { // Renamed parameter from data to value
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.getValue()) { // Updated method from getData() to getValue()
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) { // Updated method from getData() to getValue()
            root.setRight(insertRec(root.getRight(), value));
        }
        return root;
    }

    public Node getRoot() {
        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.getLeft());
            System.out.print(node.getValue() + " "); // Updated method from getData() to getValue()
            inOrderRec(node.getRight());
        }
    }
    
    public void preOrderTraversal() { // Added method
        preOrderRec(root);
    }

    private void preOrderRec(Node node) { // Added method
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrderRec(node.getLeft());
            preOrderRec(node.getRight());
        }
    }
    
    public void postOrderTraversal() { // Added method
        postOrderRec(root);
    }

    private void postOrderRec(Node node) { // Added method
        if (node != null) {
            postOrderRec(node.getLeft());
            postOrderRec(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
}