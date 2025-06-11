def insertion_sort(array:list):
    for key_index in range(1, len(array)):
        key = array[key_index]
        index = key_index - 1

        while index >= 0 and array[index] > key:
            array[index + 1] = array[index]
            index -= 1
        
        array[index + 1] = key