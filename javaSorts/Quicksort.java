package javaSorts;

public class Quicksort {

    private static int partition(int[] array, int first, int last) {
        int pivot = array[last];
        int pivotIndex = first - 1;

        for(int index = first; index < last; index++) {
            if(array[index] <= pivot) {
                pivotIndex += 1;

                HelperFunctions.swap(array, pivotIndex, index);
            }
        }

        HelperFunctions.swap(array, pivotIndex + 1, last);

        return pivotIndex + 1;
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
     * Quicksort is sorting array by taking last element as pivot and then comparing it each element if its smaller or greater 
     * than pivot and swaps them with pivot index, later it returs pivot index and sorts indexes between final pivot index (first, pivot-1 and pivot+1, last) 
     * and repeats it until its sorted.
     * <p>
     * It's also possible to take median or random(mostly used) element but it still risks O(n^2) run time.
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
     * Quicksort is <b>not stable</b>
     */
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}