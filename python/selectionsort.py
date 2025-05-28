from helper_functions import swap


def get_min_element(array, current_min):
    for index in range(current_min + 1, len(array)):
        if array[index] < array[current_min]:
            current_min = index
    
    return current_min

def selection_sort(array):
    for index in range(0, len(array) - 1):
        min_element = get_min_element(array, index)

        if min_element != index:
            swap(array, index, min_element)

arr = [5,8,3,1,9,2,5]
selection_sort(arr)

print(arr)