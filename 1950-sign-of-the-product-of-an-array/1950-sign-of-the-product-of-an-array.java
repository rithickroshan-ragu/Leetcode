class Solution {
    /*
        Technique: Math
    
        1. Even if one zero exists in array the product is 0.
        2. if odd no of -ve no exists the product is -ve.
    
        TC: O(N) SC: O(1)
    */

    public int arraySign(int[] nums) {
        int zeroes = 0, neg = 0;
        for (int i : nums) {
            if (i == 0)
                zeroes++;
            else if (i < 0)
                neg++;
        }

        if (zeroes > 0)
            return 0;
        else if (neg % 2 == 1)
            return -1;
        else
            return 1;
    }
}