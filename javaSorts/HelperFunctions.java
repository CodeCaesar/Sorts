package javaSorts;

public class HelperFunctions {
    public static void swap(int[] array, int index_a, int index_b) {
        int swapper = array[index_a];
        array[index_a] = array[index_b];
        array[index_b] = swapper;
    }
}
