class Tree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

        public void insert(node root, int data){
            if(root == null){
                root = new node(data);
            }
            else if(data < root.data){
                insert(root.left, data);
            }
            else{
                insert(root.right, data);
            }
        }
    }
    