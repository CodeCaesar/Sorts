package javaSorts;

public class Mergesort {
    
    /**
     * Merge first gets sizes leftSize and rightSize then copies two halves into left and right array, next sets last element as max which is 
     * largest element in array incremented by 1. Then for loop starts from first to last index of array and sorts in ascending order by 
     * comparing elements of left array to the right array.
     * <p>
     * Running Time: O(1) + O(1) + O(n / 2) + O(n / 2) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + 
     * O(1) + O(1) + O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) = O(7n + 6n/2 - 4 + 6) = O(10n + 2) = 
     * <b>O(n)</b>
     */
    private static void merge(int[] array, int first, int pivot, int last) {
        int leftSize = pivot - first + 1;
        int rightSize = last - pivot;
        int[] left = new int[leftSize + 1];
        int[] right = new int[rightSize + 1];

        for(int leftIndex = 0; leftIndex < leftSize; leftIndex++) left[leftIndex] = array[first + leftIndex];
        for(int rightIndex = 0; rightIndex < rightSize; rightIndex++) right[rightIndex] = array[pivot + 1 + rightIndex];

        left[leftSize] = Integer.MAX_VALUE;
        right[rightSize] = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = 0;

        for(int index = first; index <= last; index++) {
            if(left[leftIndex] <= right[rightIndex]) {
                array[index] = left[leftIndex];
                leftIndex++;
            }
            else {
                array[index] = right[rightIndex];
                rightIndex++;
            }
        }
    }

    /**
     * Merge sort first checks if first index is smaller than last, if true then get pivot by adding first and last indexes together 
     * and dividing them by 2, then recursively calling itself twice (first by taking first and pivot, then by pivot+1 and last) then 
     * calling merge.
     * <p>
     * Running Time: O(1) + O(1) + O(n log n) + O(n log n) + O(n) = O(2n log n + n + 2) = <b>O(n log n)</b>
     */
    private static void sort(int[] array, int first, int last) {
        if(first < last) {
            int pivot = (first + last) / 2;

            sort(array, first, pivot);
            sort(array, pivot + 1, last);
            merge(array, first, pivot, last);
        }
    }

    /**
     * <h2>Merge Sort</h2>
     * 
     * <h3>Description</h3>
     * Merge Sort divides array into 2 sub-arrays each being half as large, then sorting them recursively, lastly merging sorted sub-arrays 
     * which results in sorted array.
     * 
     * <h3>Running Time</h3>
     * Best Case: <b>O(n log n)</b> <p>
     * Average Case: <b>O(n log n)</b> <p>
     * Worst Case: <b>O(n log n)</b> <p>
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(n)</b> <p>
     * Merge Sort is <b>stable</b>
     */
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
