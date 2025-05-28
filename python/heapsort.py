from helper_functions import swap


def left(index):
    return (2 * index) + 1

def right(index):
    return (2 * index) + 2

def max_heapify(array, index, size):
    left_index = left(index)
    right_index = right(index)

    if left_index < size and array[left_index] > array[index]:
        largest = left_index
    else:
        largest = index
    
    if right_index < size and array[right_index] > array[largest]:
        largest = right_index
    
    if largest != index:
        swap(index, largest)
        max_heapify(array, largest, size)

def build_max_heap(array, size):
    starting_index = (size // 2) - 1

    for index in range(starting_index, -1, -1):
        max_heapify(array, index, size)