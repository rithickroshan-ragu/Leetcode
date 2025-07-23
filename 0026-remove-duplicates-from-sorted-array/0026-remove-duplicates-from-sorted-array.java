class Solution {
    /*
        Technique: Two Pointers - In Place

        initialize two pointers one to traverse the array and one to keep track of index
        where next unique element gets to added. while traversing array keep track of previous
        element. For every elemtn if it is not == prev element store it in index position and move
        to next.

        TC: O(N) SC: O(1)
    */


    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        int index = 1; // Index to place next unique element

        for (int i = 1; i < N; i++)
        {
            if (nums[i] != nums[index - 1])
            {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}