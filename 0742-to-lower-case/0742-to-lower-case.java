class Solution {
    /*
        Technique: ASCII representation
    
        Convert Uppercase letters to small case by adding +32 to ascii values of uppercase
        letters. Use strigbuilder to construct the string.
    
        TC: O(N) SC: O(N)
    */

    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        int N = s.length();
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (isUpper(c))
                ans.append((char) (c + 32));
            else
                ans.append(c);
        }

        return ans.toString();
    }

    boolean isUpper(char c) {
        if (c >= 65 && c <= 90)
            return true;
        else
            return false;
    }

}