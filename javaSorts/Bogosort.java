package javaSorts;

public class Bogosort {
    
    private static void shuffle(int[] array) {
    }

    public static void sort(int[] array) {
        while(!HelperFunctions.isSorted(array)) {
            shuffle(array);
        }
    }
}
