static void swap(int array[], int indexA, int indexB) {
    int swapper = array[indexA];
    array[indexA] = array[indexB];
    array[indexB] = swapper;
}