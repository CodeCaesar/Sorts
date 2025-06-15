package javaSorts;

public class CountingSort {
    private static int max_element(int[] array) {
        int maxElm = 0;

        for(int index = 0; index < array.length; index++) {
            if(array[index] > maxElm) {
                maxElm = array[index];
            }
        }

        return maxElm;
    }

    public static void sort(int[] array) {
        int arraySize = array.length;
        int maxElm = max_element(array) + 1;

        int[] countingTable = new int[maxElm];
        int[] sortedArray = new int[arraySize];

        for(int index = 0; index < arraySize; index++) {
            countingTable[array[index]] = countingTable[array[index]] + 1;
        }

        for(int index = 1; index < maxElm; index++) {
            countingTable[index] = countingTable[index] + countingTable[index - 1];
        }

        for(int index = arraySize - 1; index > -1; index--) {
            sortedArray[countingTable[array[index]] - 1] = array[index];
            countingTable[array[index]] = countingTable[array[index]] - 1;
        }

        for(int sortedIndex = 0; sortedIndex < arraySize; sortedIndex++) {
            array[sortedIndex] = sortedArray[sortedIndex];
        }
    }
}
