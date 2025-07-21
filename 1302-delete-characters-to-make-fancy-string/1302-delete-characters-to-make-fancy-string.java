class Solution {
    /*
        Technique: String Traversal
    
        start from the first character and keep track of count. For every character compare
        with prev character. if same character repeats for the third time skip it, do not 
        add it to ans string. When a new character is encountered re intializze count and 
        prev character.
    
        TC: O(N) SC: O(N);
    */

    public String makeFancyString(String s) {
        int N = s.length();
        StringBuilder ans = new StringBuilder();

        char prev = '#';
        int count = 0;
        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (c == prev) {
                if (count == 2) {
                    continue;
                }
                count++;
            } else {
                count = 1;
            }
            prev = c;
            ans.append(c);
        }

        return ans.toString();
    }
}