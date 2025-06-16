from helper_functions import swap


def __partition(array:list, first:int, last:int):
    """
    Takes last element as pivot (random element is mostly used but for simplicity it's last) and pivot_index which will be 
    returned as final index of pivot. Then it goes into for loop, that compares if array element at index is larger that pivot, 
    if not then increment pivot_index by 1 and swap it with current index else continue. After the loop finishes it swaps 
    pivot_index+1 with last index and returns pivot_index+1.

    Running Time: O(1) + O(1) + O(n - 1) + O(n - 1) + O(n - 1) + O(n - 1) + O(1) + O(1) = O(4(n - 1) + 4) = O(4n - 4 + 4) = <b>O(n)</b>
    """
    pivot = array[last]
    pivot_index = first - 1

    for index in range(first, last):
        if array[index] <= pivot:
            pivot_index += 1

            swap(array, pivot_index, index)
    
    swap(array, pivot_index + 1, last)

    return pivot_index + 1

def __quicksort(array:list, first:int, last:int):
    """
    Compares first and last parameters and if first is less than last it takes pivot by calling __partition function, then recursively calls 
    it self 1st by taking first and pivot-1 and then by taking pivot+1 and last, and repeat it on each recursive call.

    Running Time: <p>
    Best case: O(1) + O(n) + O(n log n) + O(n log n) = O(2n log n + n + 1) = <b>O(n log n)</b> <p>
    Worst case: O(1) + O(n) + O(1) + O(n<sup>2</sup>) = O(n<sup>2</sup> + n + 2) = <b>O(n<sup>2</sup>)</b>

    Worst case in this example is when array is already sorted so first would be equal to last thus first recursive call would be O(1).
    """
    if first < last:
        pivot = __partition(array, first, last)
        __quicksort(array, first, pivot - 1)
        __quicksort(array, pivot + 1, last)

def quicksort(array:list):
    """
    <h1>Quicksort</h1>

    <h3>Description</h3>
    Quicksort is sorting array by taking last element as pivot and then comparing it each element if its smaller or greater 
    than pivot and swaps them with pivot index, later it returs pivot index and sorts indexes between final pivot index (first, pivot-1 and pivot+1, last) 
    and repeats it until its sorted.

    It's also possible to take median or random(mostly used) element but it still risks O(n<sup>2</sup>) run time.

    <h3>Running Time</h3>
    Best Case:\t<b>O(n log n)</b> \n
    Average Case:\t<b>O(n log n)</b> \n
    Worst Case:\t<b>O(n<sup>2</sup>)</b> \n

    Worst case is when array is sorted or inverted.

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(log n)</b> \n
    Quicksort is <b>not stable</b>
    """
    __quicksort(array, 0, len(array) - 1)