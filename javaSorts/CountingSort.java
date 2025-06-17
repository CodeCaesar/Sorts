package javaSorts;

public class CountingSort {

    /**
     * Function maxElement() finds max element of an array and return incremented max.
     * <p>
     * Running time: O(1) + O(n) + O(n) + O(n) + O(1) = O(3n + 2) = <b>O(n)</b>
     */
    private static int max_element(int[] array) {
        int maxElm = 0;

        for(int index = 0; index < array.length; index++) {
            if(array[index] > maxElm) {
                maxElm = array[index];
            }
        }

        return maxElm;
    }

    /**
     * <h2>Counting Sort</h2>
     * <p>
     * <h3>Description</h3>
     * Counting sort first gets size of array and max element incremented by 1, then it creates array of size maximum element and empty array, 
     * then increments index of counting table which stores amount that an element appeared. Then it adds to every index of counting table previous 
     * amount. Then going backwards it makes sorted array have elements from array at correct place, lastly it copies over all sorted array 
     * elements to array.
     * <p>
     * <h3>Running Time</h3>
     * Running Time: O(1) + O(n) + O(k) + O(n) + O(n) + O(n) + O(k - 1) + O(k - 1) + O(n) + O(n) + O(n) + O(n) + O(n) = O(9n + 3k - 1) = <b>O(n + k)</b> <p>
     * Best Case: <b>O(n + k)</b> <p>
     * Average Case: <b>O(n + k)</b> <p>
     * Worst Case: <b>O(n + k)</b> <p>
     * <p>
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(k)</b> <p>
     * Counting Sort is <b>stable</b>
     */
    public static void sort(int[] array) {
        int arraySize = array.length;
        int maxElm = max_element(array) + 1;

        int[] countingTable = new int[maxElm];
        int[] sortedArray = new int[arraySize];

        for(int index = 0; index < arraySize; index++) {
            countingTable[array[index]] = countingTable[array[index]] + 1;
        }

        for(int index = 1; index < maxElm; index++) {
            countingTable[index] = countingTable[index] + countingTable[index - 1];
        }

        for(int index = arraySize - 1; index > -1; index--) {
            sortedArray[countingTable[array[index]] - 1] = array[index];
            countingTable[array[index]] = countingTable[array[index]] - 1;
        }

        for(int sortedIndex = 0; sortedIndex < arraySize; sortedIndex++) {
            array[sortedIndex] = sortedArray[sortedIndex];
        }
    }
}
