class Solution {
    /*
        TC: O(N) SC: O(N)
    */

    public int pivotIndex(int[] nums) {
        int right_sum = 0;
        int N = nums.length;
        for (int i = 0; i < N; i++)
            right_sum += nums[i];

        int left_sum = 0;
        for (int i = 0; i < N; i++) {
            right_sum = right_sum - nums[i];
            if (right_sum == left_sum)
                return i;
            else {
                left_sum += nums[i];
            }
        }

        return -1;
    }
}