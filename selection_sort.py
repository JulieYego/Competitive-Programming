class Solution: 
    def select(self, arr, i):
        # code here 
        for i in range(n): #0(4)
            min_index = i #0(4)
            for j in range(i+1,n):#1(1)
                return j
    
    def selectionSort(self, arr,n):

        #code here
        for i in range(n): #0
            min_index = i #0
            for j in range(i+1,n):#3(4)
                if arr[j] < arr[min_index]:#
                    arr[j],arr[min_index] = arr[min_index],arr[j]
                    min_index = j #j -2
        return arr 