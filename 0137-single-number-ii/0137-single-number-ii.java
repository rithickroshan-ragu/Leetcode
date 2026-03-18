class Solution {
    /*
        Technique: Bit Manipulation
    
        Steps:
    
        1. Count no of set bits for all numbers for all 32 bits
        2. Since all no is apperaing thrice the set bits are supposed to be multiple of 3
        except for one number which adds a additional bit.
        3. Use this additional bit to find the single number.
    
        TC: O(N) SC: O(1)
    */

    public int singleNumber(int[] nums) {
        int[] cnt = new int[32];
        for (int x : nums) {
            for (int i = 0; i < 32; i++) {
                if ((x & (1 << i)) != 0)
                    cnt[i]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((cnt[i] % 3) == 1) {
                ans |= (1 << i);
            }
        }

        return ans;
    }
}