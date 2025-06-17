from helper_functions import max_element


def counting_sort(array:list):
    """
    <h2>Counting Sort</h2>

    <h3>Description</h3>
    Counting sort first gets size of array and max element incremented by 1, then it creates array of size maximum element and empty array, 
    then increments index of counting table which stores amount that an element appeared. Then it adds to every index of counting table previous 
    amount. Then going backwards it makes sorted array have elements from array at correct place, lastly it copies over all sorted array 
    elements to array.

    <h3>Running Time</h3>
    Running Time: O(1) + O(n) + O(k) + O(n) + O(n) + O(n) + O(k - 1) + O(k - 1) + O(n) + O(n) + O(n) + O(n) + O(n) = O(9n + 3k - 1) = <b>O(n + k)</b> \n
    Best Case: <b>O(n + k)</b> \n
    Average Case: <b>O(n + k)</b> \n
    Worst Case: <b>O(n + k)</b> \n

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(k)</b> \n
    Counting Sort is <b>stable</b>
    """
    array_size = len(array)
    max_elm = max_element(array)

    counting_table = [0 for _ in range(0, max_elm)]
    sorted_array = [0 for _ in range(0, array_size)]

    for index in range(0, array_size):
        counting_table[array[index]] = counting_table[array[index]] + 1
    
    for index in range(1, max_elm):
        counting_table[index] = counting_table[index] + counting_table[index - 1]
    
    for index in range(array_size - 1, -1, -1):
        sorted_array[counting_table[array[index]] - 1] = array[index]
        counting_table[array[index]] = counting_table[array[index]] - 1
    
    for sorted_index in range(0, array_size):
        array[sorted_index] = sorted_array[sorted_index]


arr = [5,8,3,1,9,2,5]
counting_sort(arr)

print(arr)