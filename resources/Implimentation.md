Implimentation of Binary Tree Traversals in Java

```java
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
```

Next, create the `BinaryTree` class with traversal methods:

```java
class BinaryTree {
    Node root;

    // Pre-order traversal
    void preOrderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // In-order traversal
    void inOrderTraversal(Node node) {
        if (node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    // Post-order traversal
    void postOrderTraversal(Node node) {
        if (node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}
```

Finally, in the `Main` class, construct the tree and perform traversals:

```java
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually construct the binary tree
        tree.root = new Node(1);             // Root node
        tree.root.left = new Node(2);        // Left child of root
        tree.root.right = new Node(3);       // Right child of root
        tree.root.left.left = new Node(4);   // Left child of node 2
        tree.root.left.right = new Node(5);  // Right child of node 2

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nIn-order traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
```

**Output:**

```
Pre-order traversal:
1 2 4 5 3
In-order traversal:
4 2 5 1 3
Post-order traversal:
4 5 2 3 1
```

This demonstrates the pre-order, in-order, and post-order traversals on a binary tree in Java.