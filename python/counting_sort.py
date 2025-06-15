from helper_functions import max_element


def counting_sort(array:list):
    #CountingSort
    array_size = len(array)
    max_elm = max_element(array)

    counting_table = [0 for x in range(0, max_elm)]
    sorted_array = [0 for x in range(0, array_size)]

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