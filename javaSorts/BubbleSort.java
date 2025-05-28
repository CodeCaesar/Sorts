package javaSorts;

public class BubbleSort {
    public static void sort(int[] array) {
        
        for(int position = 0; position < array.length; position++) {
            boolean swapped = false;

            for(int index = 1; index < array.length - position; index++) {
                if(array[index] < array[index - 1]) {
                    HelperFunctions.swap(array, index, index - 1);
                    swapped = true;
                }
            }
            
            if(!swapped) {
                break;
            }
        }
    }
}
