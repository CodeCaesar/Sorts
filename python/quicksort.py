from helper_functions import swap


def partition(array:list, first:int, last:int):
    pivot = array[last]
    pivot_index = first - 1

    for index in range(first, last):
        if array[index] <= pivot:
            pivot_index += 1

            swap(array, pivot_index, index)
    
    swap(array, pivot_index + 1, last)

    return pivot_index + 1

def __quicksort(array:list, first:int, last:int):
    if first < last:
        pivot = partition(array, first, last)
        __quicksort(array, first, pivot - 1)
        __quicksort(array, pivot + 1, last)

def quicksort(array:list):
    """
    <h1>Quicksort</h1>

    <h3>Description</h3>
    Quicksort is sorting array by taking last element as pivot and then comparing it each element if its smaller or greater 
    than pivot and swaps them with pivot index, later it returs pivot index and sorts indexes between final pivot index (first, pivot-1 and pivot+1, last) 
    and repeats it until its sorted.

    It's also possible to take median or random(mostly used) element but it still risks O(n^2) run time.

    <h3>Running Time</h3>
    Best Case:\t<b>O(n log n)</b> \n
    Average Case:\t<b>O(n log n)</b> \n
    Worst Case:\t<b>O(n^2)</b> \n

    Worst case is when array is sorted or inverted.

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(log n)</b> \n
    Bogosort is <b>not stable</b>
    """
    __quicksort(array, 0, len(array) - 1)