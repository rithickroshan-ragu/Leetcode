"""
Technique: Two Pinters
TC: O(N) SC: O(1)
"""


class Solution:
    def rotate(self, nums: list[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        N = len(nums)
        k = k % N
        self.reverse(nums, 0, N - 1)
        Solution.reverse(nums, 0, k - 1)
        Solution.reverse(nums, k, N - 1)

    @classmethod
    def reverse(cls, arr, s, e):
        while s < e:
            temp = arr[s]
            arr[s] = arr[e]
            arr[e] = temp
            s += 1
            e -= 1
