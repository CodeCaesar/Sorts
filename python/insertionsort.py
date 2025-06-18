def insertion_sort(array:list):
    """
    <h2>Insertion Sort</h2>

    <h3>Description</h3>
    Insertion sort loops

    <h3>Running Time</h3>
    Running Time: O(n-1) + O(n-1) + O(n-1) + O((n-1)<sup>2</sup>) + O((n-1)<sup>2</sup>) + O((n-1)<sup>2</sup>) + O(n-1) = 
    O(3(n-1)<sup>2</sup> + 4(n-1)) = O(3n<sup>2</sup> - 2n - 1) = <b>O(n<sup>2</sup>)</b> \n
    Best Case: <b>O(n)</b> \n
    Average Case: <b>O(n<sup>2</sup>)</b> \n
    Worst Case: <b>O(n<sup>2</sup>)</b> \n

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(1)</b> \n
    Insertion Sort is <b>stable</b>
    """
    for key_index in range(1, len(array)):
        key = array[key_index]
        index = key_index - 1

        while index >= 0 and array[index] > key:
            array[index + 1] = array[index]
            index -= 1
        
        array[index + 1] = key