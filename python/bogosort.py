from helper_functions import is_sorted
import random


def bogosort(array:list):
    while not is_sorted(array):
        random.shuffle(array)