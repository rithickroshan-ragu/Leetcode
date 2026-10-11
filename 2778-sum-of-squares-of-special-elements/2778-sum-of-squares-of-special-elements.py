class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        ans = 0
        N = len(nums)
        for i in range(N):
            if N % (i + 1) == 0:
                ans += nums[i] ** 2

        return ans
