def swap(array, index_a, index_b):
    """
    Function swap() swaps elements of index a and b of an array.
    Running time: O(1) + O(1) + O(1) = O(3) = O(1)
    """
    swapper = array[index_a]
    array[index_a] = array[index_b]
    array[index_b] = swapper