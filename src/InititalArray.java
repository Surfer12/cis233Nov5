import java.util.Arrays;

public class InititalArray {
    static class SortedArray {
        private int[] originalArr;
        private int[] sortedArr;

        public CopyArray(int[] arr) {
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
        int[] arr = {80, 70, 60, 50, 40, 30};
        SortedArray sortedArray = new SortedArray(arr);
        System.out.println("Original array: " + Arrays.toString(sortedArray.getOriginalArray()));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray.sortArray()));
    }
}
