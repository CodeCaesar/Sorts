from helper_functions import swap


def bubble_sort(array:list):
    """
    <h2>Bubble Sort</h2>

    <h3>Description</h3>
    Bubble sort loops through entire array, first it creates variable swapped which is set to false, then it loops from index 1 to last index 
    decremented by current position in first loop and 1, then if current index has smaller element than previous element than swap them and 
    swapped variable is set to true. If swapped is false than break loop and array is sorted.

    <h3>Running Time</h3>
    Running Time: O(n) + O(n) + O((n-1)<sup>2</sup>) + O((n-1)<sup>2</sup>) + O((n-1)<sup>2</sup>) + O((n-1)<sup>2</sup>) + O(n) + O(1) = 
    O(4(n-1)<sup>2</sup> + 3n + 1) = O(4n<sup>2</sup> - 5n + 5) = <b>O(n<sup>2</sup>)</b> \n
    Best Case: <b>O(n)</b> \n
    Average Case: <b>O(n<sup>2</sup>)</b> \n
    Worst Case: <b>O(n<sup>2</sup>)</b> \n

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(1)</b> \n
    Bubble Sort is <b>stable</b>
    """
    for position in range(0, len(array)):
        swapped = False
        
        for index in range(1, len(array) - position):
            if array[index] < array[index - 1]:
                swap(array, index, index - 1)
                swapped = True
        
        if not swapped:
            break