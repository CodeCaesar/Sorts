from helper_functions import swap


def __left(index:int):
    return (2 * index) + 1

def __right(index:int):
    return (2 * index) + 2

def __max_heapify(array:list, index:int, size:int):
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
    starting_index = (size // 2) - 1

    for index in range(starting_index, -1, -1):
        __max_heapify(array, index, size)

def __heapsort(array:list, size:int):
    __build_max_heap(array, size)
    heap_size = size

    for index in range(size - 1, 0, -1):
        swap(array, 0, index)
        heap_size -= 1
        __max_heapify(array, 0, heap_size)

def heapsort(array:list):
    __heapsort(array, len(array))