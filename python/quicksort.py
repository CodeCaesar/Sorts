from helper_functions import swap


def partition(array, first, last):
    last_element = array[last]
    pivot = first - 1

    for index in range(first, last):
        if array[index] <= last_element:
            pivot += 1

            swap(array, pivot, index)
    
    swap(array, pivot + 1, last)

    return pivot + 1

def __quicksort(array, first, last):
    if first < last:
        pivot = partition(array, first, last)
        __quicksort(array, first, pivot - 1)
        __quicksort(array, pivot + 1, last)

def quicksort(array):
    __quicksort(array, 0, len(array) - 1)