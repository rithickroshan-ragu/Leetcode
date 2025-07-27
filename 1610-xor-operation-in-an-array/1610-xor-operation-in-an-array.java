class Solution {
    /*
        Technique: Bitwise XOR

        TC: O(N) SC: O(1)
    */

    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            ans ^= (start + 2 * i); 
        }

        return ans;
    }
}