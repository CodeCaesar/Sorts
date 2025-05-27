package javaSorts;

public class Quicksort {

    private static int partition(int[] array, int first, int last) {
        int lastElement = array[last];
        int pivot = first - 1;

        for(int index = first; index < last; index++) {
            if(array[index] <= lastElement) {
                pivot += 1;

                HelperFunctions.swap(array, pivot, index);
            }
        }

        HelperFunctions.swap(array, pivot + 1, last);

        return pivot + 1;
    }

    private static void sort(int[] array, int first, int last) {
        if(first < last) {
            int pivot = partition(array, first, last);
            sort(array, first, pivot - 1);
            sort(array, pivot + 1, last);
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}