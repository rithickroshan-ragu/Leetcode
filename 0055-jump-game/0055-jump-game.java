class Solution {
    public boolean canJump(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N];

        return jump(nums, 0, dp);
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