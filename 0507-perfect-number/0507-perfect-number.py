"""
Technique: Find factors with SQRT TimeComplexity
TC: O(SQRT(n)) SC: O(1)
"""


class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num <= 1:
            return False
        ans = 0
        for i in range(1, int(sqrt(num)) + 1):
            if num % i == 0:
                if i == 1:
                    ans += 1
                elif i == num // i:
                    ans += i
                else:
                    ans += i
                    ans += num // i

        print(ans)
        print(num)
        return ans == num
