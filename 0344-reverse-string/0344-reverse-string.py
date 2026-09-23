"""
Technique: Two Pointers
TC: O(n) SC: O(1)

"""


class Solution:
    def reverseString(self, s: list[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """

        l = 0
        r = len(s) - 1
        while l < r:
            temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l += 1
            r -= 1
