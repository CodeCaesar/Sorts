package javaSorts;

public class Mergesort {
    
    /**
     * Merge first gets sizes left_size and right_size then copies two halves into left and right array, next sets last element as max which is 
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

    private static void sort(int[] array, int first, int last) {
        if(first < last) {
            int pivot = (first + last) / 2;

            sort(array, first, pivot);
            sort(array, pivot + 1, last);
            merge(array, first, pivot, last);
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
