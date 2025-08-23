class Solution {
    /*
    
        Approach 1:
    
        Technique: Binary Search
    
        1. Do a binary search to find if a num is a power of 3.
        2. n == 3^^x where x can be from 1 ... log3(n).
        3. Do binary search on this range of powers to see if it matches any num.
    
        TC: O(log3 N)    SC: O(1)
    
        Approach 2:
    
        Technique: Math, Divide by 3 continuously
    
        1. Coninuously check if num is divisible by 3 and divide by 3.
        2. Finally if not divisible and num == 1 return true else return false.
    
        TC: log3(N) SC: O(1)
    */

    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;

        while (n % 3 == 0) {
            n /= 3;
        }
        if (n == 1)
            return true;
        return false;

        // long s = 0, e = n;
        // while (s <= e) {
        //     long mid = (s + e) / 2;
        //     long val = (long) Math.pow(3, mid);
        //     if (n - val == 0)
        //         return true;
        //     else if (val < n)
        //         s = mid + 1;
        //     else
        //         e = mid - 1;
        // }

        // return false;
    }
}