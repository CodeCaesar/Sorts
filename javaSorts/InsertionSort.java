package javaSorts;

public class InsertionSort {
    
    /**
     * <h2>Insertion Sort</h2>
     * 
     * <h3>Description</h3>
     * Insertion sort loops through array starting at 2nd index and sets variable key as element of first loop's index, 
     * then sets variable index as key index decremented by 1 and begins while loop. Which moves every element to the right starting 
     * at index all the way to 1st index unless current element is smaller or equal to key, and then it moves key at the end.
     * It repeats it until array is sorted.
     * 
     * <h3>Running Time</h3>
     * Running Time: O(n-1) + O(n-1) + O(n-1) + O((n-1)^2) + O((n-1)^2) + O((n-1)^2) + O(n-1) = O(3(n-1)^2 + 4(n-1)) = 
     * O(3n^2 - 2n - 1) = <b>O(n^2)</b> <p>
     * Best Case: <b>O(n)</b> <p>
     * Average Case: <b>O(n^2)</b> <p>
     * Worst Case: <b>O(n^2)</b> <p>
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(1)</b> <p>
     * Insertion Sort is <b>stable</b>
     */
    public static void sort(int[] array) {
        for(int keyIndex = 1; keyIndex < array.length; keyIndex++) {
            int key = array[keyIndex];
            int index = keyIndex - 1;

            while(index >= 0 && array[index] > key) {
                array[index + 1] = array[index];
                index -= 1;
            }

            array[index + 1] = key;
        }
    }
}
