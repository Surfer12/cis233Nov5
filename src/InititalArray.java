import java.util.Arrays;

public class InititalArray {
    static class SortedArray {
        private final int[] originalArr;
        private int[] sortedArr;

        public SortedArray(int[] arr) {
            // Create a copy to preserve the original array
            this.originalArr = Arrays.copyOf(arr, arr.length);
            this.sortedArr = Arrays.copyOf(arr, arr.length);
        }

        public int[] sortArray() {
            Arrays.sort(sortedArr);
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
        int[] arr = {80, 70, 60, 50, 40, 30};
        SortedArray sortedArray = new SortedArray(arr);
        
        System.out.println("Original array: " + Arrays.toString(sortedArray.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray.sortArray()));
    }
}
