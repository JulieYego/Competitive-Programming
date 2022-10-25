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
    #[2(0),4(1),6(2),8(3),3(4)] n = 5
    x = arr[n-1]
    new_arr = []
    for i in range(n - 2, -1, -1):  # i = 3,2,1,0
        if  arr[i] > x:
            arr[i + 1] = arr[i]
            print(*arr)
            
        if arr[i] < x:
            arr[i + 1] = x
            print(*arr)

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    insertionSort1(n, arr)

