def swap(array:list, index_a:int, index_b:int):
    """
    Function swap() swaps elements of index a and b of an array.

    Running time: O(1) + O(1) + O(1) = O(3) = O(1)
    """
    swapper = array[index_a]
    array[index_a] = array[index_b]
    array[index_b] = swapper

def is_sorted(array:list):
    """
    Function is_sorted() checks if array is sorted by comparing corrent element to the next; if current element is larger than next, 
    it returns false, if it goes throught entire array and every element is either smaller or equal to the next element that return true.

    Running time: O(n) + O(n) + O(n) + O(1) = O(3n + 1) = O(n)
    """
    for index in range(0, len(array) - 1):
        if array[index] > array[index + 1]:
            return False
    
    return True

def get_array(array:list):
        """
        Function get_array() runs through every element of an array and adds it to string arrayElements, and returns all elements.
        Also depending if loop is at last index it either has additional comma at the end of an element or doesn't.

        Running time: O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(1) = O(5n + 3) = O(n)
        However strings are immutable, thus program creates new string every loop, so the acual running time is:
        O(1) + O(1) + O(n) + O(n) + O(n^2) + O(n) + O(n^2) + O(1) = O(2n^2 + 3n + 3) = O(n^2)
        """
        arrayElements = ""
        followupIndex = len(array) - 1

        for index in range(0, len(array)):
            if index < followupIndex:
                arrayElements += f"{array[index]}, "
            else:
                arrayElements += f"{array[index]}"

        return arrayElements

def max_element(array:list):
    """
    FucFunction max_element() finds max element of an array and return incremented max.

    Running time: O(1) + O(n) + O(n) + O(n) + O(1) = O(3n + 2) = O(n)
    """
    max = array[0]

    for index in range(1, len(array)):
        if array[index] > max:
            max = array[index]
    
    return max + 1