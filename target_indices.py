class Solution(object):
    def targetIndices(self, nums, target):
        sorted_nums = sorted(nums)
        ans = []
        length = len(sorted_nums)
        for i in range(length):
            if target == sorted_nums[i]:
                ans.append(i)
        return ans

        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
