package javaSorts;

public class HelperFunctions {

    /**
     * Function swap() swaps elements of index a and b of an array.
     * <p>
     * Running time: O(1) + O(1) + O(1) = O(3) = <b>O(1)</b>
     */
    public static void swap(int[] array, int indexA, int indexB) {
        int swapper = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swapper;
    }

    /**
     * Function is_sorted() checks if array is sorted by comparing corrent element to the next; if current element is larger than next, 
     * it returns false, if it goes throught entire array and every element is either smaller or equal to the next element that return true.
     * <p>
     * Running time: O(n) + O(n) + O(n) + O(1) = O(3n + 1) = <b>O(n)</b>
     */
    public static boolean isSorted(int[] array) {
        for(int index = 0; index < array.length - 1; index++) {
            if(array[index] > array[index + 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Function get_array() runs through every element of an array and adds it to string arrayElements, and returns all elements.
     * Also depending if loop is at last index it either has additional comma at the end of an element or doesn't.
     * 
     * Running time: O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(1) = O(5n + 3) = <b>O(n)</b> <p>
     * However strings are immutable, thus program creates new string every loop, so the acual running time is: <p>
     * O(1) + O(1) + O(n) + O(n) + O(n^2) + O(n) + O(n^2) + O(1) = O(2n^2 + 3n + 3) = <b>O(n^2)</b>
     */
    public static String getArray(int[] array) {
        String arrayElements = "";
        int followupIndex = array.length - 1;

        for(int index = 0; index < array.length; index++) {
            if(index < followupIndex) {
                arrayElements += array[index] + ", ";
            } else {
                arrayElements += array[index];
            }
        }

        return arrayElements;
    }
}
