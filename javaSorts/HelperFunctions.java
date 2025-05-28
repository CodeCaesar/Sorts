package javaSorts;

public class HelperFunctions {
    public static void swap(int[] array, int index_a, int index_b) {
        int swapper = array[index_a];
        array[index_a] = array[index_b];
        array[index_b] = swapper;
    }

    public static boolean isSorted(int[] array) {
        for(int index = 0; index < array.length - 1; index++) {
            if(array[index] > array[index + 1]) {
                return false;
            }
        }

        return true;
    }

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
