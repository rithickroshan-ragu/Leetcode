class Solution {
    /*
        Technique: Two Pointers
    
        Initialize two pointers at start and end of the string. Now compare both the characters
        at start and end pointers and move both simultaneously. Skip any non-alpha characters.
    
        TC: O(N) SC: O(1)
    */

    public boolean isPalindrome(String s) {
        int N = s.length();

        int l = 0, r = N - 1;
        while (l < r) {
            if (!isAlphaNumeric(s.charAt(l))) {
                l++;
                continue;
            }

            if (!isAlphaNumeric(s.charAt(r))) {
                r--;
                continue;
            }

            char a = toLower(s.charAt(l));
            char b = toLower(s.charAt(r));

            if (a != b)
                return false;

            l++;
            r--;
        }

        return true;
    }

    char toLower(char c) {
        if (c >= 65 && c <= 90)
            return (char) (c + 32);
        else
            return c;
    }

    boolean isAlphaNumeric(char c) {
        if (c >= 65 && c <= 90)
            return true;
        else if (c >= 97 && c <= 122)
            return true;
        else if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }
}