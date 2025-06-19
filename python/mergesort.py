from helper_functions import max_element


def __merge(array:list, first:int, pivot:int, last:int, max:int):
    """
    Merge first gets sizes left_size and right_size then copies two halves into left and right array, next sets last element as max which is 
    largest element in array incremented by 1. Then for llop starts from first to last index of array and sorts in ascending order by 
    comparing elements of left array to the right array.

    Running Time: O(1) + O(1) + O(n / 2) + O(n / 2) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + 
    O(1) + O(1) + O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) = O(7n + 6n/2 - 4 + 6) = O(10n + 2) = 
    <b>O(n)</b>
    """
    left_size = pivot - first + 1
    right_size = last - pivot

    left = [0 for _ in range(0, left_size + 1)]
    right = [0 for _ in range(0, right_size + 1)]

    for left_index in range(0, left_size):
        left[left_index] = array[first + left_index]
    for right_index in range(0, right_size):
        right[right_index] = array[pivot + 1 + right_index]

    left[left_size] = max
    right[right_size] = max
    left_index = 0
    right_index = 0

    for index in range(first, last + 1):
        if left[left_index] <= right[right_index]:
            array[index] = left[left_index]
            left_index += 1
        else:
            array[index] = right[right_index]
            right_index += 1

def __mergesort(array:list, first:int, last:int, max:int):
    if first < last:
        pivot = (first + last) // 2

        __mergesort(array, first, pivot, max)
        __mergesort(array, pivot + 1, last, max)
        __merge(array, first, pivot, last, max)

def mergesort(array:list):
    max = max_element(array)
    __mergesort(array, 0, len(array) - 1, max)


arr = [5,8,3,1,9,2,5]
mergesort(arr)

print(arr)