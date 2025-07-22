class Solution {
    /*
        Technique: Two Pointers, Sets
    
        initialize two pointers at the start s and e. Now expand the window by moving e and keep
        track of elements in current window by using a set. When you encounter a duplicate element
        shrink the current window by moving s pointer until you remove previous occurenece of that
        element. Move the window until you traverse all the elements in the array. Keep track of
        subarray sum and max subarray sum while traversing.
    
        TC: O(N) SC: O(N)
    */

    public int maximumUniqueSubarray(int[] nums) {
        int N = nums.length;
        int s = 0, e = 0;
        int sum = 0, max = 0;
        HashSet<Integer> set = new HashSet<>();

        while (e < N) {
            int val = nums[e];
            while (s < e && set.contains(val)) {
                set.remove(nums[s]);
                sum -= nums[s];
                s++;
            }
            sum += val;
            max = Math.max(max, sum);
            set.add(val);
            e++;
        }

        return max;
    }
}