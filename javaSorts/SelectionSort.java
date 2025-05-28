package javaSorts;

public class SelectionSort {
    
    public static int getMinElement(int[] array, int current_min) {
        for(int index = current_min + 1; index < array.length; index++) {
            if(array[index] < array[current_min]) {
                current_min = index;
            }
        }
        
        return current_min;
    }

    public static void sort(int[] array) {
        for(int index = 0; index < array.length - 1; index++) {
            int min_element = getMinElement(array, index);

            if(min_element != index) {
                HelperFunctions.swap(array, index, min_element);
            }
        }
    }
}
