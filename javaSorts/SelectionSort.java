package javaSorts;

public class SelectionSort {
    
    /**
     * Goes over entire array and compares current smallest element to current one and picks the smallest, after loop is finished it returns current min.
     * <p>
     * Running Time: O(n) + O(n) + O(n) + O(1) = O(3n + 1) = <b>O(n)</b>
     */
    private static int getMinElement(int[] array, int currentMin) {
        for(int index = currentMin + 1; index < array.length; index++) {
            if(array[index] < array[currentMin]) {
                currentMin = index;
            }
        }
        
        return currentMin;
    }

    /**
     * <h2>Selection Sort</h2>
     * 
     * <h3>Description</h3>
     * First gets smallest element of array between next index and last index, then if smallest element isn't current index than swap.
     * Repeats until for loop finishes.
     * 
     * <h3>Running Time</h3>
     * Running Time: O(n - 1) + O((n - 1)^2) + O(n - 1) + O(n - 1) = O((n-1)^2 + 3n - 3) = O(n^2 + n - 2) = <b>O(n^2)</b> <p>
     * Best Case: <b>O(n^2)</b> <p>
     * Average Case: <b>O(n^2)</b> <p>
     * Worst Case: <b>O(n^2)</b> <p>
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(1)</b> <p>
     * Selection Sort is <b>not stable</b>
     */
    public static void sort(int[] array) {
        for(int index = 0; index < array.length - 1; index++) {
            int minElement = getMinElement(array, index);

            if(minElement != index) {
                HelperFunctions.swap(array, index, minElement);
            }
        }
    }
}
