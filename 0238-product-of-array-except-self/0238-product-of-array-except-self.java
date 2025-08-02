class Solution {
    /*
        Technique: Prefix / Suffix arrays
    
        Buld prefix and suffix array of products. now for every element find the product of rem 
        elements in the array except for it by calculating prefix[i - 1] * suffix[i + 1].
    
        TC: O(N) SC: O(N)
    */

    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];

        prefix[0] = nums[0];
        for (int i = 1; i < N; i++)
            prefix[i] = nums[i] * prefix[i - 1];

        suffix[N - 1] = nums[N - 1];
        for (int i = N - 2; i >= 0; i--)
            suffix[i] = nums[i] * suffix[i + 1];

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int prev = (i - 1) < 0 ? 1 : prefix[i - 1];
            int next = (i + 1) < N ? suffix[i + 1] : 1;

            ans[i] = prev * next;
        }

        return ans;
    }
}