class Solution {
    public int maximumUniqueSubarray(int[] nums) {
            int N = nums.length;
            int s = 0, e = 0;
            int sum = 0, max = 0;
            HashSet<Integer> set = new HashSet<>();


            while (e < N)
            {
                int val = nums[e];
                while (s < e && set.contains(val))
                {
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