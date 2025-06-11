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

    /**
     * <h1>Quicksort</h1>
     * 
     * <h3>Description</h3>
     * Quicksort is sorting array by taking last element and then comparing it each element if its smaller or greater 
     * than last element and swaps them with pivot, later it returs pivot and sorts indexes between pivot (first, pivot-1 and pivot+1, last) 
     * and repeats it until its sorted.
     * 
     * <h3>Running Time</h3>
     * Best Case:\t<b>O(n log n)</b> \n
     * Average Case:\t<b>O(n log n)</b> \n
     * Worst Case:\t<b>O(n^2)</b> \n
     * 
     * Worst case is when array is sorted or inverted.
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(log n)</b> \n
     * Bogosort is <b>not stable</b>
     */
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}