from helper_functions import swap


def __left(index:int):
    """
    Returns index multiplied by 2 and then incremented by 1

    Running Time: O(1) = <b>O(1)</b>
    """
    return (2 * index) + 1

def __right(index:int):
    """
    Returns index multiplied by 2 and then incremented by 2

    Running Time: O(1) = <b>O(1)</b>
    """
    return (2 * index) + 2

def __max_heapify(array:list, index:int, size:int):
    """
    Max heapify is used to maintain max-heap property.

    Running Time: O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(log n) = O(log n + 10) = <b>O(log n)</b>

    log being base 2: log<sub>2</sub>
    """
    left_index = __left(index)
    right_index = __right(index)

    if left_index < size and array[left_index] > array[index]:
        largest = left_index
    else:
        largest = index
    
    if right_index < size and array[right_index] > array[largest]:
        largest = right_index
    
    if largest != index:
        swap(array, index, largest)
        __max_heapify(array, largest, size)

def __build_max_heap(array:list, size:int):
    """
    Build max heap builds max-heap from unordered array.

    Running Time: O(1) + O(n / 2 - 1) + O(n log n / 2 - log n) = <b>O(n log n)</b> \n
    However operations are distributed in efficient way over diffrent tree depths leading to overall time complexity of: \n
    Running Time: <b>O(n)</b>
    """
    starting_index = (size // 2) - 1

    for index in range(starting_index, -1, -1):
        __max_heapify(array, index, size)

def __heapsort(array:list, size:int):
    """
    Heapsort starts with building max heap then makes variable heap_size to be size of the heap. Then loop starts from size 
    decremented by 1 down to 2nd index, each time loop runs; 1st index is being swapped with loop index and heap_size is 
    decremented by 1, and max heapify is being called. After loop finishes array is sorted.

    Running Time: O(n) + O(1) + O(n - 2) + O(n - 2) + O(n - 2) + O(n log n - 2 log n) = O(n log n + 4n - 2 log n - 5) = <b>O(n log n)</b>
    """
    __build_max_heap(array, size)
    heap_size = size

    for index in range(size - 1, 0, -1):
        swap(array, 0, index)
        heap_size -= 1
        __max_heapify(array, 0, heap_size)

def heapsort(array:list):
    __heapsort(array, len(array))