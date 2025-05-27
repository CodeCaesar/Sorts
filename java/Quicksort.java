package java;

public class Quicksort {

    private int partition(int[] array, int first, int last) {
        int lastElement = array[last];
        int pivot = first - 1;

        for(int index = first; index < last; index++) {
            if(array[index] <= lastElement) {
                pivot += 1;

                int swapper = array[pivot];
                array[pivot] = array[index];
                array[index] = swapper;
            }
        }

        int swapper = array[pivot + 1];
        array[pivot + 1] = array[last];
        array[last] = swapper;

        return pivot + 1;
    }

    public void sort(int[] array) {}
}