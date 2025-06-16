from helper_functions import max_element


def __merge(array:list, first:int, pivot:int, last:int, max:int):
    """
    
    Running Time: O(1) + O(1) + O(n / 2) + O(n / 2) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + O(n / 2 - 1) + 
    O(1) + O(1) + O(1) + O(1) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) + O(n) = O(7n + 6n/2 - 4 + 4) = O(10n) = 
    <b>O(n)</b>
    """
    leftSize = pivot - first + 1
    rightSize = last - pivot

    left = [0 for _ in range(0, leftSize + 1)]
    right = [0 for _ in range(0, rightSize + 1)]

    for leftIndex in range(0, leftSize):
        left[leftIndex] = array[first + leftIndex]
    for rightIndex in range(0, rightSize):
        right[rightIndex] = array[pivot + 1 + rightIndex]

    left[leftSize] = max
    right[rightSize] = max
    leftIndex = 0
    rightIndex = 0

    for index in range(first, last + 1):
        if left[leftIndex] <= right[rightIndex]:
            array[index] = left[leftIndex]
            leftIndex += 1
        else:
            array[index] = right[rightIndex]
            rightIndex += 1

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