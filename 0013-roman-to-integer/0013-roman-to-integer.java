class Solution {
    /*
        Technique: Two Pointers
    
        1. Initialize two pointers ate the first and secodn characters of the string.
        2. If val of first character is greater than second. Add 1st char val to answer.
        3. if 2nd char is greater subtract val of 2nd from 1st chars vala dn then add to sum.
    
        TC: O(N)    SC: O(1)
    */

    public int romanToInt(String s) {
        int N = s.length(), l = 0, r = 1;
        int num = 0;
        while (r < N) {
            int val1 = romanToInteger(s.charAt(l));
            int val2 = romanToInteger(s.charAt(r));
            if (val1 < val2) {
                num += val2 - val1;
                l = r + 1;
                r = r + 2;
            } else {
                num += val1;
                l++;
                r++;
            }
        }

        if (l < N)
            num += romanToInteger(s.charAt(l));

        return num;
    }

    int romanToInteger(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}