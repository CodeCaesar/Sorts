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
        } else if(rightIndex < size && array[rightIndex] > array[largest]) {
            largest = rightIndex;
        }

        if(largest != index) {
            HelperFunctions.swap(array, index, largest);
            maxHeapify(array, largest, size);
        }
    }

    private static void buildMaxHeap(int[] array, int size) {}

    private static void sort(int[] array, int size) {}

    public static void sort(int[] array) {}
}