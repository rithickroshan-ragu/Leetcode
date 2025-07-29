class Solution {
    /*
        Approach 1:

        Technique: Dynamic Programming
        Start from the first index and check all possible jumps. Do it for all elements in the
        array. Use memoization to optimize to store intermediate results.

        TC: O(N^2) SC: O(N) 

        Approach 2:
        Technique: Greedy Algorithm

        Traverese the array while keeping track of the farthest index you could have jumped 
        so far. for any 0 encountered before the farthest pos we can ignore them. for any 0
        encountered after the farthest pos means we cannot jump to end of array.

        TC: O(N) SC: O(1)
    */

    public boolean canJump(int[] nums) {
        int N = nums.length;
        int farthest = 0;
        for (int i = 0; i < N; i++)
        {
            farthest = Math.max(farthest, i + nums[i]);
            if (nums[i] == 0 && i >= farthest)
                break;
        }

        return farthest >= nums.length - 1? true: false;

        // int[] dp = new int[N];

        // return jump(nums, 0, dp);
    }

    boolean jump(int[] nums, int index, int[] dp) {
        if (index >= nums.length - 1)
            return true;
        if (dp[index] != 0) {
            if (dp[index] > 0)
                return true;
            else
                return false;
        }

        int maxJumps = nums[index];
        boolean canReach = false;
        for (int i = 1; i <= maxJumps; i++) {
            if (jump(nums, index + i, dp)) {
                canReach = true;
                break;
            }
        }

        dp[index] = canReach ? 1 : -1;

        return canReach;
    }
}