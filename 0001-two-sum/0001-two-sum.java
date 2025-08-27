class Solution {
    /*
        Approach 1:
    
        Technique: HashMap (Insert while traversing)
    
        1. for every number in array check if target - n is present (already seen). If so return the 
        index of these two elements.
        2. After visiting every elements add element, index to the hashmap.
    
        TC: O(N)    SC: O(N)
    
        Approach 2:
    
        1. Loop through all pairs of the arrays. 
    
        TC: O(N^^2) SC: O(1)
    
        Approach 3: Sorting + binary Search
    
        1. Sort array in ascending order.
        2. For every element check if target - n is present in the array using binary search.
    
        TC: O(N logN + N logN)  SC: O(N)
    */

    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = nums[i], b = target - a;
            if (map.containsKey(b))
                return new int[] { i, map.get(b) };
            map.put(a, i);
        }

        return new int[2];
    }
}