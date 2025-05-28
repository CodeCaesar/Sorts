package javaSorts;

public class HelperFunctions {
    public static void swap(int[] array, int indexA, int indexB) {
        int swapper = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swapper;
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
