class Solution {
    /*
        Technique: Two Pointers
    
        1. Initialize two pointers at start of each staring.
        2. Compare the characters in each staring to equality. If they macth move both pointers.
        3. If they dont match move the pointer in main staring forward until you find the character.
    
        TC: O(s1_length + s2_length)    SC: O(1)
    */

    public boolean isSubsequence(String s, String t) {
        int s1_length = s.length(), s2_length = t.length();
        int p1 = 0, p2 = 0;

        while (p1 < s1_length && p2 < s2_length) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        if (p1 == s1_length)
            return true;
        else
            return false;
    }
}