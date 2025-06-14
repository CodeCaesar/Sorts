from helper_functions import swap


def bubble_sort(array:list):
    for position in range(0, len(array)):
        swapped = False
        
        for index in range(1, len(array) - position):
            if array[index] < array[index - 1]:
                swap(array, index, index - 1)
                swapped = True
        
        if not swapped:
            break