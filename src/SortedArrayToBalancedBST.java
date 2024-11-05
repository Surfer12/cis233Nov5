// Sorted Array to Balanced BST
// Given an array where elements are may or may not be sorted in ascending order, sort it and  convert it to a height balanced BST.
// Find the middle element of the array and make it the root of the tree. Then, recursively construct the left and right halves of the tree.
/*

/* Main class, tree class, node class, */

Tree structure is:
        80
       /  \
      70   60
     / \     \
    50  60    40
       \
        30
       /
      20
*/

import java.util.*;

class SortedArray


class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    class Tree{
        Node root;
        Tree(){
            root = null;
        }

        public void insert(Node root, int data){
            if(root == null){
                root = new Node(data);
            }
            else if(data < root.data){
                insert(root.left, data);
            }
            else{
                insert(root.right, data);
            }
        }
    }

}