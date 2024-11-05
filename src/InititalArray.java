import java.util.Arrays;

public class InititalArray {
    class SortedArray {
        int[] treeArr;

        public SortedArray(int[] arr) {
            this.treeArr = arr;
        }

        public int[] sortArray() {
            Arrays.sort(treeArr);
            return treeArr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {80, 70, 60, 50, 40, 30};
        InititalArray initArray = new InititalArray();
        SortedArray sortedArray = initArray.new SortedArray(arr);
        int[] sortedArr = sortedArray.sortArray();
        System.out.println(Arrays.toString(sortedArr));
    }
}
