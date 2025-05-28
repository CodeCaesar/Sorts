package javaSorts;

public class InsertionSort {
    public static void sort(int[] array) {
        for(int key_index = 1; key_index < array.length; key_index++) {
            int key = array[key_index];
            int index = key_index - 1;

            while(index >= 0 && array[index] > key) {
                array[index + 1] = array[index];
                index -= 1;
            }

            array[index + 1] = key;
        }
    }
}
