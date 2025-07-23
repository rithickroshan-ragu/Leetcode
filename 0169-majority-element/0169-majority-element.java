class Solution {
    /*
        Technique: Sorting, HashMap
    
        Approach 1: Sorting, since element appears n/2 times, the mid element will always be the 
        majority element => TC: O(N logN) SC: O(1)
    
        Approach 2: Count using Hashmap. TC: O(N) SC: O(N)
    */

    public int majorityElement(int[] nums) {
        int N = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int max_freq = 0, element = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int key = nums[i];
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);

            if (map.get(key) > max_freq) {
                max_freq = map.get(key);
                element = key;
            }
        }

        return element;
    }
}