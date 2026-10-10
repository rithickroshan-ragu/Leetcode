"""
Approach 1: HastSet TC: O(N) SC: O(N)

Step 1: Add all elements to hashset so we can check if a element exists in O(1) time.
Step 2: start with first elemtn of array and check if the increasing order and decresing order is present. remove whatever elemtn is the sequence which is present including current elemtn.
Step 3: Now move to the next element of the array and repeat. This way we only check a complete sequence only once and move to next independant sequence.

TC: O(N) Amortized SC: O(N)
"""


class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:

        N = len(nums)
        s = set(nums)

        ans = 0
        for i in range(N):  # O(N)
            a = nums[i]
            length = 0
            # check if a is present in map and remove
            if a in s:
                length += 1
                s.remove(a)

            # Check decreasing order
            num = a - 1
            while num in s:  # N - Amortized
                length += 1
                s.remove(num)
                num -= 1

            # Check Increasing Order
            num = a + 1  # N - Amortized
            while num in s:
                length += 1
                s.remove(num)
                num += 1

            ans = max(ans, length)

        return ans
