class Solution {
    /*
        Technique: HashMap
        Step 1: Use HashMap and add first value of array to map with index 0. This map contains
                most recent occurence of an element with its index.
        Step 2: Now check all possible pairs (2 pari combination) of no's and if they are equal, 
                check if another value exist by checking in hashmap.
        Step 3: Calculate the abs length difference btw the indexes.


        TC: O(N**2) SC: O(N)
    */

    public int minimumDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        int N = nums.length;

        int ans = Integer.MAX_VALUE;
        for (int j = 1; j < N; j++) {
            for (int k = j + 1; k < N; k++) {
                if (nums[j] == nums[k] && map.containsKey(nums[j])) {
                    int idx_i = map.get(nums[j]);
                    ans = Math.min(ans, Math.abs(j - k) + Math.abs(j - idx_i) + Math.abs(k - idx_i));
                }
            }
            map.put(nums[j], j);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}