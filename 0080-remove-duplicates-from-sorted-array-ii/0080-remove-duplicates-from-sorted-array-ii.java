class Solution {
    /*
        Technique: Two Pointers - In Place

        initialize two pointers one to traverse the array and one to keep track of index
        where next unique element gets to added. while traversing array keep track of pre 
        predecessor element. For every element if it is not != pre predecessor element store 
        it in index position and move to next.

        TC: O(N) SC: O(1)
    */

    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        int index = 0; // Index to place next unique element

        for (int i = 0; i < N; i++)
        {
            int prev = (index - 2) < 0? Integer.MIN_VALUE: nums[index - 2]; 
            if (nums[i] != prev)
            {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;   
    }
}