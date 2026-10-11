"""
N % (i+1) = 0  //nums[i]
    (i+1) * quotient = N

quotient  = N // (i+1)

TC: O(sqrt(N)) SC: O(1)
"""


class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        ans = 0
        N = len(nums)
        for i in range(int(math.sqrt(N))):
            if N % (i + 1) == 0:
                ans += nums[i] ** 2
                if (i + 1) != N // (i + 1):
                    ans += nums[(N // (i + 1)) - 1] ** 2

        return ans
