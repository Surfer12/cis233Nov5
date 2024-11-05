package Classes;


public class Tree {
    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), data));
        } else if (data > root.getData()) {
            root.setRight(insertRec(root.getRight(), data));
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
            System.out.print(node.getData() + " ");
            inOrderRec(node.getRight());
        }
    }
}