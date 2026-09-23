"""
Technique: Cyclic sort
TC: O(n) SC: O(1)
"""


class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        N = len(nums)
        i = 0
        while i < N:
            val = nums[i]
            if val > N - 1:
                i += 1
                continue
            if nums[val] == val:
                i += 1
                continue
            else:
                temp = nums[val]
                nums[val] = val
                nums[i] = temp
                i -= 1
            i += 1

        print(nums)

        i = 0
        while i < N and i == nums[i]:
            i += 1

        return i
