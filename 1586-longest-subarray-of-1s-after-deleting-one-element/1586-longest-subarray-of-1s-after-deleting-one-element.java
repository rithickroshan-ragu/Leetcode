class Solution {
    /*
        Technique: Two Pointers
    
        1. Initialize two pointers l, r at the start of the array.
        2. Move r pointer forward until you see a zero. Skip the first zero (replace with ones).
        3. When no more ones available to replace regain ones by moving the l pointer. Move the l 
        pointer forward until you get past on zero. 
        4. Keep track of the lenght of the window while processing. 
        5. if all elements in array are ones (ans == N) then return ans - 1, bcs we should compulsorily
        delete one element even if it is all ones.
    
        TC: O(N)    SC: O(1)
    */

    public int longestSubarray(int[] nums) {
        int N = nums.length;
        int l = 0, r = 0;
        int ones = 1, len = 0, ans = 0;
        while (r < N) {
            if (nums[r] == 1) {
                len++;
                r++;
                ans = Math.max(ans, len);
            } else if (ones > 0) {
                r++;
                ones--;
            } else {
                while (l < r && ones == 0) {
                    if (nums[l] == 0)
                        ones++;
                    else
                        len--;
                    l++;
                }
            }
        }

        return ans == N ? ans - 1 : ans;
    }
}