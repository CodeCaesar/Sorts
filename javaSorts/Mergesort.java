package javaSorts;

public class Mergesort {
    
    private static void merge(int[] array, int first, int pivot, int last) {
        int leftSize = pivot - first + 1;
        int rightSize = last - pivot;
        int[] left = new int[leftSize + 1];
        int[] right = new int[rightSize + 1];

        for (int leftIndex = 0; leftIndex < leftSize; leftIndex++) left[leftIndex] = array[first + leftIndex];
        for (int rightIndex = 0; rightIndex < rightSize; rightIndex++) right[rightIndex] = array[pivot + 1 + rightIndex];

        left[leftSize] = Integer.MAX_VALUE;
        right[rightSize] = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int index = first; index <= last; index++) {
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
}
