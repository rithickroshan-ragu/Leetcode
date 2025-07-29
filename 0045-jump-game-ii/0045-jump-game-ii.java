class Solution {
    /*
        Technique: Dynamic Programming

        Start with first of array and try all possible jumps. Do the same for all elemnents of
        the array. Store min #jumps while trying all possible paths. Use memoization to optimize.

        TC: O(N^2) SC: O(N)
    */


    public int jump(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return minJumps(nums, 0, dp);
    }

    int minJumps(int[] nums, int index, int[] dp) {
        if (index >= nums.length - 1)
            return 0;
        if (dp[index] != -1)
            return dp[index];

        // Jump forward - all possible jumps
        int jumps = nums.length;
        for (int i = 1; i <= nums[index]; i++) {
            jumps = Math.min(jumps, 1 + minJumps(nums, index + i, dp));
        }

        return dp[index] = jumps;
    }
}