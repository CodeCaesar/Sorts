package javaSorts;

import java.util.Random;

public class Bogosort {
    
    /**
     * The shuffle method randomly arranges elements in java array.
     * <p>
     * Running Time: O(1) + O(n) + O(n) + O(n) = O(3n + 1) = <b>O(n)</b>
     */
    private static void shuffle(int[] array) {
        int randomIndex;

        for(int index = 0; index < array.length; index++) {
            randomIndex = new Random().nextInt(array.length);
            HelperFunctions.swap(array, index, randomIndex);
        }
    }

    /**
     * <h2>Bogosort</h2>
     * 
     * <h3>Description</h3>
     * Bogosort is sorting array by randomly shuffling it until it's sorted. This is also why bogosort isn't an actual
     * algorithm since it can run forever.
     * <p>
     * It's also possible to take median or random(mostly used) element but it still risks O(n^2) run time.
     * 
     * <h3>Running Time</h3>
     * Best Case:\tO(3n + 1) = <b>O(n)</b> \n
     * Average Case:\t<b>O(n!)</b> \n
     * Worst Case:\t<b>Infinite</b> \n
     * 
     * <h3>Space Complexity & Stability</h3>
     * Space complexity is: <b>O(1)</b> \n
     * Bogosort is <b>not stable</b>
     */
    public static void sort(int[] array) {
        while(!HelperFunctions.isSorted(array)) {
            shuffle(array);
        }
    }
}
