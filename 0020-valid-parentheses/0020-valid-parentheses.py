"""
Technique: Stacks

TC: O(N) SC: O(N)
"""


class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        isValid = True
        for c in s:
            if Solution.isOpenBracket(c):
                stack.append(c)
            else:
                if Solution.pairExists(c, stack):
                    stack.pop()
                else:
                    isValid = False
                    break

        return isValid and len(stack) == 0

    @staticmethod
    def pairExists(c, stack):
        if len(stack) == 0:
            return False
        if c == ")" and stack[-1] == "(":
            return True
        if c == "}" and stack[-1] == "{":
            return True
        if c == "]" and stack[-1] == "[":
            return True
        return False

    @staticmethod
    def isOpenBracket(c):
        if c in ["(", "{", "["]:
            return True
        return False
