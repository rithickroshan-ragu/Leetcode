class Solution:
    def numIdenticalPairs(self, nums: list[int]) -> int:
        N = len(nums)
        map = {}
        ans = 0
        for i in range(N - 1, -1, -1):
            curr = nums[i]
            if not curr in map:
                map[curr] = 1
            else:
                ans += map[curr]
                map[curr] += 1

        return ans
