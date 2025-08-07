class Solution {
    /*
        Technique: String Traversal
    
        1. Traverse from last of string and finds the first non-space character position - index.
        2. Now find the lenght of the word from that index.
    
        TC: O(N) SC: O(1)
    */

    public int lengthOfLastWord(String s) {
        int N = s.length();
        int len = 0, index = -1;

        for (int i = N - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c - ' ' != 0) {
                index = i;
                break;
            }
        }

        for (int i = index; i >= 0; i--) {
            char c = s.charAt(i);
            if (c - ' ' != 0)
                len++;
            else
                break;
        }

        return len;
    }
}