class Solution {
    /*
        TC: O(log4 N)   SC: O(1)
    */

    public boolean isPowerOfFour(int n) {
        if (n <= 0)
            return false;

        while (n > 1) {
            int rem = n % 4;
            if (rem != 0)
                return false;
            n = n >> 2;
        }

        return true;
    }
}