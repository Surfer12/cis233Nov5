import java.util.Arrays;

public class InititalArray {
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
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        ArraySorter sortedArray = new ArraySorter(arr);
        int[] sortedArr = sortedArray.sortArray();
        System.out.println("Original array: " + Arrays.toString(sortedArray.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString
    }
}
