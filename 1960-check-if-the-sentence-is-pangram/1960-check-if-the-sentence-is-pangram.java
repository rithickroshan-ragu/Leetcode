class Solution {
    /*
        Technique: Frequency Array
        Maintain a freqency array for alphabets. Loop through the sentence and record all
        alphabets in the frequency array. Once doen loop through the freqency array to check 
        if all alphabets exist.

        TC: O(N) SC: O(1)
    */

    public boolean checkIfPangram(String sentence) {
        int N = sentence.length();
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < N; i++) {
            char c = sentence.charAt(i);
            alphabets[c - 97] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabets[i])
                return false;
        }

        return true;
    }
}