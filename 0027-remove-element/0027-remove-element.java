class Solution {
    /*
        Technique: Two Pointers
    
        Initialize two pointer at start one called index => referring to where non-target element
        must be placed and another pointer for looping through the array. While traversing place 
        every non-target element at the index pointer and move the pointers.
    
        TC: O(N) SC: O(1)
    */

    public int removeElement(int[] nums, int val) {
        int N = nums.length;
        int index = 0;
        for (int i = 0; i < N; i++)
        {
            if (nums[i] != val)
            {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}