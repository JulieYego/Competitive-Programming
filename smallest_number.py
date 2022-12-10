class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        counter = []
        l = len(nums)
        for i in range(l):
            x = sum(1 for num in nums if num < nums[i])
            counter.append(x)
        return counter
