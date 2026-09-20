class Solution:
    def reverseDegree(self, s: str) -> int:
        ans = 0
        for i, c in enumerate(s):
            degree = (i+1) * (26 - (ord(c) - 97))
            ans += degree

        return ans
        