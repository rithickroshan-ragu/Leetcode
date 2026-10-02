"""
    Technique: Recursion and Backtracking
    TC: O(4**n) CATLAN Number SC: O(N)
"""

class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        validPairs = []
        curr = []

        Solution.solve(0, 0, n, curr, validPairs)

        return validPairs

    @staticmethod
    def solve(open, close, n, curr, validPairs):
        if open == n and close == n:
            validPairs.append("".join(curr))
            return

        # use open bracket
        if open < n:
            curr.append("(")
            Solution.solve(open + 1, close, n, curr, validPairs)
            curr.pop()

        # use close bracket
        if close < open:
            curr.append(")")
            Solution.solve(open, close + 1, n, curr, validPairs)
            curr.pop()
