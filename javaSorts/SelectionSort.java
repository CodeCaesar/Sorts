package javaSorts;

public class SelectionSort {
    
    public static int getMinElement(int[] array, int currentMin) {
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
