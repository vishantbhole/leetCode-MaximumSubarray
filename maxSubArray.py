class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxSub = nums[0]
        result = 0

        for num in nums:
            if(result < 0):
                result = 0
            result += num
            maxSub = max(maxSub,result)
        return maxSub
