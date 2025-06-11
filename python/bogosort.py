from helper_functions import is_sorted
import random


def bogosort(array:list):
    """
    <h1>Bogosort</h1>

    <h3>Description</h3>
    Bogosort is sorting array by randomly shuffling it until it's sorted. This is also why bogosort isn't an actual
    algorithm since it can run forever.

    <h3>Running Time</h3>
    Best Case:\tO(3n + 1) = <b>O(n)</b> \n
    Average Case:\t<b>O(n!)</b> \n
    Worst Case:\t<b>Infinite</b> \n

    <h3>Space Complexity & Stability</h3>
    Space complexity is: <b>O(1)</b> \n
    Bogosort is <b>not stable</b>
    """
    while not is_sorted(array):
        random.shuffle(array)