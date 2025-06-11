from helper_functions import swap


def left(index:int):
    return (2 * index) + 1

def right(index:int):
    return (2 * index) + 2

def max_heapify(array:list, index:int, size:int):
    left_index = left(index)
    right_index = right(index)

    if left_index < size and array[left_index] > array[index]:
        largest = left_index
    else:
        largest = index
    
    if right_index < size and array[right_index] > array[largest]:
        largest = right_index
    
    if largest != index:
        swap(array, index, largest)
        max_heapify(array, largest, size)

def build_max_heap(array:list, size:int):
    starting_index = (size // 2) - 1

    for index in range(starting_index, -1, -1):
        max_heapify(array, index, size)

def __heapsort(array:list, size:int):
    build_max_heap(array, size)
    heap_size = size

    for index in range(size - 1, 0, -1):
        swap(array, 0, index)
        heap_size -= 1
        max_heapify(array, 0, heap_size)

def heapsort(array:list):
    __heapsort(array, len(array))