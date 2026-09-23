"""
Technique: Prefix Sum
TC: O(N**2) SC:O(N)
"""

class Solution:
    def sumOddLengthSubarrays(self, arr: list[int]) -> int:
        N = len(arr)
        prefix = [0] * N
        prefix[0] = arr[0]
        for i in range(1, N):
            prefix[i] = arr[i] + prefix[i - 1]

        print(prefix)

        ans = 0
        for i in range(0, N):
            for j in range(i, N, 2):
                if i == 0:
                    ans += prefix[j]
                else:
                    ans += prefix[j] - prefix[i - 1]

        return ans
