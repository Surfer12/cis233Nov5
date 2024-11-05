/* Version 1.1 */

import java.util.Arrays;

public class InitialArray1.1 {
    static class ArraySorter {
        private int[] originalArr;
        private int[] sortedArr;
        private Tree root;

        public ArraySorter(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }    
            this.originalArr = Arrays.copyOf(arr, arr.length);
            this.sortedArr = Arrays.copyOf(arr, arr.length);
            this.root = new Tree();
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

        public Tree convertToBST() {
            sortedArrayToBST(0, sortedArr.length - 1);
            return root;
        }
            
        private void sortedArrayToBST(int start, int end) {
            if (start > end) return;
            
            int mid = (start + end) / 2;
            root.insert(sortedArr[mid]);
            
            sortedArrayToBST(start, mid - 1);
            sortedArrayToBST(mid + 1, end);
        }

        // Helper method to print BST in-order
        public void printInOrder() {
            System.out.println("BST In-order traversal:");
            root.inOrderTraversal();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
        ArraySorter sorter = new ArraySorter(arr);
        int[] sortedArr = sorter.sortArray();
        System.out.println("Original Array: " + Arrays.toString(sorter.getOriginalArray()));
        System.out.println("Sorted Array: " + Arrays.toString(sorter.getSortedArray()));

        Tree root = sorter.convertToBST();

        System.out.println("Root Node: " + root.getRoot().data);
        sorter.printInOrder();
    }
}
