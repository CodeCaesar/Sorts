def swap(array, index_a, index_b):
    """
    Function swap() swaps elements of index a and b of an array.

    Running time: O(1) + O(1) + O(1) = O(3) = O(1)
    """
    swapper = array[index_a]
    array[index_a] = array[index_b]
    array[index_b] = swapper

def is_sorted(array):
    """
    Function is_sorted() checks if array is sorted by comparing corrent element to the next; if current element is larger than next, 
    it returns false, if it goes throught entire array and every element is either smaller or equal to the next element that return true.

    Running time: O(n) + O(n) + O(n) + O(1) = O(n)
    """
    for index in range(0, len(array) - 1):
        if array[index] > array[index + 1]:
            return False
    
    return True