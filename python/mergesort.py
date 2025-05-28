from helper_functions import max_element


def merge(array, first, pivot, last, max):
    leftSize = pivot - first + 1
    rightSize = last - pivot

    left = [0 for x in range(0, leftSize + 1)]
    right = [0 for x in range(0, rightSize + 1)]

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

def __mergesort(array, first, last, max):
    if first < last:
        pivot = (first + last) // 2

        __mergesort(array, first, pivot, max)
        __mergesort(array, pivot + 1, last, max)
        merge(array, first, pivot, last, max)

def mergesort(array):
    max = max_element(array)
    __mergesort(array, 0, len(array) - 1, max)


arr = [5,8,3,1,9,2,5]
mergesort(arr)

print(arr)