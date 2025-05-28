def insertion_sort(array):
    for key_index in range(1, len(array)):
        key = array[key_index]
        index = key_index - 1

        while index >= 0 and array[index] > key:
            array[index + 1] = array[index]
            index -= 1
        
        array[index + 1] = key


arr = [5,8,3,1,9,2,5]
insertion_sort(arr)

print(arr)