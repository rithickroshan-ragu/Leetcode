class Solution {
    /*
        Technique: Kadane's Algorithm
    
        Iterate over the array in a loop. For every element find the max subarray sum ending at that 
        position. To find that,  for every element we have two option, either extend the subarray from 
        previous element if the max sum ending at previous position is positive. If negative, start a 
        new subarray starting from current position.
    
        TC: O(N) SC: O(1)
    */

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, N = nums.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            // reset/start new subarray if max subarray ending before is negative.
            if (sum < 0)
                sum = 0;
            sum += nums[i];

            // Check and update if the current subarray sum is larger
            max = Math.max(max, sum);
        }

        return max;
    }
}