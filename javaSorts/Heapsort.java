package javaSorts;

public class Heapsort {

    /**
     * Returns index multiplied by 2 and then incremented by 1
     * <p>
     * Running Time: O(1) = <b>O(1)</b>
     */
    private static int left(int index) {
        return (2 * index) + 1;
    }

    /**
     * Returns index multiplied by 2 and then incremented by 2
     * <p>
     * Running Time: O(1) = <b>O(1)</b>
     */
    private static int right(int index) {
        return (2 * index) + 2;
    }

    /**
     * Max heapify is used to maintain max-heap property.
     * <p>
     * Running Time: O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(log n) = O(log n + 10) = <b>O(log n)</b>
     * <p>
     * log being base 2: log_{2}
     */
    private static void maxHeapify(int[] array, int index, int size) {
        int leftIndex = left(index);
        int rightIndex = right(index);
        int largest = index;

        if(leftIndex < size && array[leftIndex] > array[largest]) {
            largest = leftIndex;
        }
        
        if(rightIndex < size && array[rightIndex] > array[largest]) {
            largest = rightIndex;
        }

        if(largest != index) {
            HelperFunctions.swap(array, index, largest);
            maxHeapify(array, largest, size);
        }
    }

    /**
     * Build max heap builds max-heap from unordered array.
     * <p>
     * Running Time: O(1) + O(n / 2 - 1) + O(n log n / 2 - log n) = <b>O(n log n)</b> <p>
     * However operations are distributed in efficient way over diffrent tree depths leading to overall time complexity of: <p>
     * Running Time: <b>O(n)</b>
     */
    private static void buildMaxHeap(int[] array, int size) {
        int startingIndex = (size / 2) - 1;

        for (int index = startingIndex; index > -1; index--) {
            maxHeapify(array, index, size);
        }
    }

    /**
     * Heapsort starts with building max heap then makes variable heapSize to be size of the heap. Then loop starts from size 
     * decremented by 1 down to 2nd index, each time loop runs; 1st index is being swapped with loop index and heapSize is 
     * decremented by 1, and max heapify is being called. After loop finishes array is sorted.
     * <p>
     * Running Time: O(n) + O(1) + O(n - 2) + O(n - 2) + O(n - 2) + O(n log n - 2 log n) = O(n log n + 4n - 2 log n - 5) = <b>O(n log n)</b>
     */
    private static void sort(int[] array, int size) {
        buildMaxHeap(array, size);
        int heapSize = size;

        for(int index = size - 1; index > 0; index--) {
            HelperFunctions.swap(array, 0, index);
            heapSize -= 1;
            maxHeapify(array, 0, heapSize);
        }
    }

    /**
     * <h2>Heapsort</h2>
     * <p>
     * <h3>Description</h3>
     * Heapsort starts by bulding max heap, then looping through array and in every iteration it: 
     * swaps index with 1st index then decreasing heap size by 1 and max heapifing. After loop finishes then array is sorted.
     * <p>
     * <h3>Running Time</h3>
     * Best Case: <b>O(n log n)</b> <p>
     * Average Case: <b>O(n log n)</b> <p>
     * Worst Case: <b>O(n log n)</b> <p>
     * <p>
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(1)</b> <p>
     * Heapsort is <b>not stable</b>
     */
    public static void sort(int[] array) {
        sort(array, array.length);
    }
}