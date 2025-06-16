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

    public static void sort(int[] array) {
        for(int index = 0; index < array.length - 1; index++) {
            int minElement = getMinElement(array, index);

            if(minElement != index) {
                HelperFunctions.swap(array, index, minElement);
            }
        }
    }
}
