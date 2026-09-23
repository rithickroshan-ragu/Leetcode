"""
Technique: rversing array,
step1: strat from right and find the index where the a[i] < a[i + 1] and swap
if nothing exists this permutation is the maximum already. rever to the intial permutation
step2: reverse array from i + 1 to N-1

TC: O(N) SC: O(1)
"""


class Solution:
    def nextPermutation(self, nums: list[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        N = len(nums)
        idx = -1
        for i in range(N - 1, 0, -1):
            if nums[i] > nums[i - 1]:
                idx = i - 1
                break
        if idx == -1:
            Solution.reverse(nums, 0, N - 1)
            return

        for i in range(N - 1, idx, -1):
            if nums[i] > nums[idx]:
                Solution.swap(nums, i, idx)
                break

        Solution.reverse(nums, idx + 1, N - 1)

    @staticmethod
    def swap(nums, x, y):
        nums[x], nums[y] = nums[y], nums[x]

    @staticmethod
    def reverse(nums, l, r):
        N = len(nums)
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
