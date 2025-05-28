package javaSorts;

public class Main {
    public static void main(String[] args) {
        // Quick testing
        int[] arr = {5,8,3,1,9,2,5};
        //Quicksort.sort(arr);
        //Heapsort.sort(arr);
        //InsertionSort.sort(arr);
        SelectionSort.sort(arr);

        System.out.println(HelperFunctions.getArray(arr));
    }
}
