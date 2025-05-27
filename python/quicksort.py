def partition(array, first, last):
    last_element = array[last]
    pivot = first - 1

    for index in range(first, last):
        if array[index] < last_element:
            pivot =+ 1
            swapper = array[pivot]
            array[pivot] = array[index]
            array[index] = swapper
    
    swapper = array[pivot + 1]
    array[pivot + 1] = array[last]
    array[last] = swapper

    return pivot + 1

def __quicksort(array, first, last):
    if first < last:
        pivot = partition(array, first, last)
        __quicksort(array, first, pivot - 1)
        __quicksort(array, pivot + 1, last)