package javaSorts;

public class Quicksort {

    /**
     * Takes last element as pivot (random element is mostly used but for simplicity it's last) and pivotIndex which will be 
     * returned as final index of pivot. Then it goes into for loop, that compares if array element at index is larger that pivot, 
     * if not then increment pivotIndex by 1 and swap it with current index else continue. After the loop finishes it swaps 
     * pivotIndex+1 with last index and returns pivotIndex+1.
     * <p>
     * Running Time: O(1) + O(1) + O(n - 1) + O(n - 1) + O(n - 1) + O(n - 1) + O(1) + O(1) = O(4(n - 1) + 4) = O(4n - 4 + 4) = <b>O(n)</b>
     */
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

    /**
     * Compares first and last parameters and if first is less than last it takes pivot by calling __partition function, then recursively calls 
     * it self 1st by taking first and pivot-1 and then by taking pivot+1 and last, and repeat it on each recursive call.
     * <p>
     * Running Time: <p>
     * Best case: O(1) + O(n) + O(n log n) + O(n log n) = O(2n log n + n + 1) = <b>O(n log n)</b> <p>
     * Worst case: O(1) + O(n) + O(1) + O(n^2) = O(n^2 + n + 2) = <b>O(n^2)</b> <p>
     * 
     * Worst case in this example is when array is already sorted so first would be equal to last thus first recursive call would be O(1).
     */
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