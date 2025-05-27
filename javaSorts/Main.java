package javaSorts;

public class Main {
    public static void main(String[] args) {
        // Quick testing
        int[] arr = {5,8,3,1,9,2,5};
        Quicksort.sort(arr);

        for(int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
