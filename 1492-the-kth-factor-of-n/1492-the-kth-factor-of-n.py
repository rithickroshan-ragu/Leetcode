"""
Technique: count factors until sqrt(N)
TC: O(SQRT(N))      SC: O(SQRT(N))
"""


class Solution:
    def kthFactor(self, n: int, k: int) -> int:
        factors1, factors2 = self.findFactors(n)  # sqrt(n)
        print(factors1)
        print(factors2)
        factors = []
        factors.extend(factors1)
        factors.extend(factors2[::-1])
        print(factors)
        if len(factors) < k:
            return -1
        return factors[k - 1]

    def findFactors(self, n):
        factors1 = []
        factors2 = []
        for i in range(1, int(sqrt(n)) + 1):
            if n % i == 0:
                if i == n // i:
                    factors1.append(i)
                else:
                    factors1.append(i)
                    factors2.append(n // i)

        return factors1, factors2
