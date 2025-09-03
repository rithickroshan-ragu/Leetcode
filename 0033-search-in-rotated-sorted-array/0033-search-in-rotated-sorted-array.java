class Solution {
    /*
        Technique: Binary Search
    
        1. Initialize two pointer at the start and end position of array.
        2. Find the mid position and check if it is target. If yes return index.
        3. Else cehck if the element lies in left portion or right portion of rotated array. 
        Based on that move your s and e pointers.
    
        TC: O(Log N)  SC: O(1)
    */

    public int search(int[] nums, int target) {
        int N = nums.length;
        int s = 0, e = N - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            int val = nums[mid];

            if (val == target) {
                return mid;
            } else if (val >= nums[0]) {
                if (target >= nums[0] && target < val)
                    e = mid - 1;
                else
                    s = mid + 1;
            } else {
                if (target > val && target <= nums[N - 1])
                    s = mid + 1;
                else
                    e = mid - 1;
            }
        }

        return -1;
    }
}