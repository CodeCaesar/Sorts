package javaSorts;

public class BubbleSort {

    /**
     * <h2>Bubble Sort</h2>
     * 
     * <h3>Description</h3>
     * Bubble sort loops through entire array, first it creates variable swapped which is set to false, then it loops from index 1 to last index 
     * decremented by current position in first loop and 1, then if current index has smaller element than previous element than swap them and 
     * swapped variable is set to true. If swapped is false than break loop and array is sorted.
     * 
     * <h3>Running Time</h3>
     * Running Time: O(n) + O(n) + O((n-1)^2) + O((n-1)^2) + O((n-1)^2) + O((n-1)^2) + O(n) + O(1) = 
     * O(4(n-1)^2 + 3n + 1) = O(4n^2 - 5n + 5) = <b>O(n^2)</b> <p>
     * Best Case: <b>O(n)</b> <p>
     * Average Case: <b>O(n^2)</b> <p>
     * Worst Case: <b>O(n^2)</b> <p>
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(1)</b> <p>
     * Bubble Sort is <b>stable</b>
     */
    public static void sort(int[] array) {
        
        for(int position = 0; position < array.length; position++) {
            boolean swapped = false;

            for(int index = 1; index < array.length - position; index++) {
                if(array[index] < array[index - 1]) {
                    HelperFunctions.swap(array, index, index - 1);
                    swapped = true;
                }
            }
            
            if(!swapped) {
                break;
            }
        }
    }
}
