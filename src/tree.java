class Tree{
    node root;
    Tree(){
        root = null;
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