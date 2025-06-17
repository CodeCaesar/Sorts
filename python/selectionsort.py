from helper_functions import swap


def __get_min_element(array:list, current_min:int):
    """
    Goes over entire array and compares current smallest element to current one and picks the smallest, after loop is finished it returns current min.

    Running Time: O(n) + O(n) + O(n) + O(1) = O(3n + 1) = <b>O(n)</b>
    """
    for index in range(current_min + 1, len(array)):
        if array[index] < array[current_min]:
            current_min = index
    
    return current_min

def selection_sort(array:list):
    """
    <h2>Selection Sort</h2>

    <h3>Description</h3>
    First gets smallest element of array between next index and last index, then if smallest element isn't current index than swap.
    Repeats until for loop finishes.

    <h3>Running Time</h3>
    Running Time: O(n - 1) + O((n - 1)<sup>2</sup>) + O(n - 1) + O(n - 1) = O((n-1)<sup>2</sup> + 3n - 3) = O(n<sup>2</sup> + n - 2) = <b>O(n<sup>2</sup>)</b> \n
    Best Case:\t<b>O(n<sup>2</sup>)</b> \n
    Average Case:\t<b>O(n<sup>2</sup>)</b> \n
    Worst Case:\t<b>O(n<sup>2</sup>)</b> \n

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(1)</b> \n
    Selection Sort is <b>not stable</b>
    """
    for index in range(0, len(array) - 1):
        min_element = __get_min_element(array, index)

        if min_element != index:
            swap(array, index, min_element)