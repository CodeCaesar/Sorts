package javaSorts;

public class InsertionSort {
    
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
