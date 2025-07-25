class Solution {
    /*
        Technique: HashSet
    
        We need a subarray of unique elements with maximum sum. So we need to include all positive
        integers to the sum excluding any negative inetegers and 0. Use a set to keep track of 
        already seen elements. 
        Since we need atleast one element in the array we can keep track of the max element in
        the array. So if all elements in the array is less than -ve the ans is the max of the
        array else ans will be the sum.
    
        TC: O(N) SC: O(N)
    */

    public int maxSum(int[] nums) {
        int N = nums.length;

        HashSet<Integer> set = new HashSet<>();
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            if (i > 0 && !set.contains(i)) {
                sum += i;
                set.add(i);
            }
        }

        return max > 0 ? sum : max;
    }
}