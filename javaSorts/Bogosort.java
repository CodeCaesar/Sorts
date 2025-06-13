package javaSorts;

import java.util.Random;

public class Bogosort {
    
    /**
     * The shuffle method randomly arranges elements in java array.
     * 
     * Running Time: O(1) + O(n) + O(n) + O(n) = O(3n + 1) = <b>O(n)</b>
     */
    private static void shuffle(int[] array) {
        int randomIndex;

        for(int index = 0; index < array.length; index++) {
            randomIndex = new Random().nextInt(array.length);
            HelperFunctions.swap(array, index, randomIndex);
        }
    }

    public static void sort(int[] array) {
        while(!HelperFunctions.isSorted(array)) {
            shuffle(array);
        }
    }
}
