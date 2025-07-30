class Solution {
    /*
    
        Approach 1:
        Technique: HashMap
    
        Use hashmap to count frequency of all chars in the string. Now find the first char with
        one occurence.
    
        TC: O(N) SC: O(N)
    
        Approach 2:
        Technique: Freqency array
    
        Build a freqency array of 26 chars in alphabet for all chars in the string. now fidn the
        first char with only one occurence.
    
        TC: O(N) SC: O(N)
    */

    public int firstUniqChar(String s) {
        // int N = s.length();
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     if (map.containsKey(c))
        //         map.put(c, map.get(c) + 1);
        //     else
        //         map.put(c, 1);
        // }

        // for (int i = 0; i < N; i++) {
        //     char c = s.charAt(i);
        //     if (map.get(c) == 1)
        //         return i;
        // }

        // return -1;

        /* ======================================================================= */

        int N = s.length();
        char[] chars = s.toCharArray();
        int[] freq = new int[26];

        for (int i = 0; i < N; i++)
            freq[chars[i] - 'a']++;

        for (int i = 0; i < N; i++) {
            if (freq[chars[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }
}