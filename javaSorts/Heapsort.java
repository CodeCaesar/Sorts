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

    private static void sort(int[] array, int size) {
        buildMaxHeap(array, size);
        int heapSize = size;

        for(int index = size - 1; index > 0; index--) {
            HelperFunctions.swap(array, 0, index);
            heapSize -= 1;
            maxHeapify(array, 0, heapSize);
        }
    }

    public static void sort(int[] array) {
        sort(array, array.length);
    }
}