#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'insertionSort1' function below.
#
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY arr
#


def insertionSort1(n, arr):
    # Write your code here
    # [2(0),4(1),6(2),8(3),3(4)] n = 5
    x = arr[n - 1]
    for i in range(n - 2, -1, -1):  # i = 3,2,1,0
        if arr[i] > x:
            arr[i + 1] = arr[i]
            print(*arr)

        if arr[i] < x:
            arr[i + 1] = x
            print(*arr)
            return

    # if __name__ == "__main__":
    # n = int(input().strip())

    # arr = list(map(int, input().rstrip().split()))
    # arr = 1 3 5 9 13 22 27 35 46 51 55 83 87 23


# n = int(input("Enter size of array: ").strip())
n = 10
print(n)

# arr = list(map(int, input().rstrip().split()))
arr = [2, 3, 4, 5, 6, 7, 8, 9, 10, 1]
print(arr)
insertionSort1(n, arr)
