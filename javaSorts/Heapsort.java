package javaSorts;

public class Heapsort {

    private static int left(int index) {
        return (2 * index) + 1;
    }

    private static int right(int index) {
        return (2 * index) + 2;
    }

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