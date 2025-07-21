class Solution {
    /*
        Technique: Two Pointers
    
        Initialize two pointer at first and last element. Check is nums[s] == val. Then replace
        with end last pointer. ensure last pointer is not pointing to element == val. Keep count
        of non k values and return. 
    
        TC: O(N) SC: O(1)
    */

    public int removeElement(int[] nums, int val) {
        int N = nums.length;
        int s = 0, e = N - 1;
        int k = 0;
        while (s <= e) {
            if (nums[s] == val) {
                while (e > s && nums[e] == val) {
                    e--;
                }

                if (e == s)
                    break;

                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                k++;
                s++;
                e--;
            } else {
                k++;
                s++;
            }
        }

        return k;
    }

    void swap(int[] nums, int s, int e) {

    }
}