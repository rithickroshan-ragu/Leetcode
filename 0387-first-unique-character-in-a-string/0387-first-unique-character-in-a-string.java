class Solution {
    /*
        Technique: HashMap
    
        Use hashmap to count frequency of all chars in the string. Now find the first char with
        one occurence.
    
        TC: O(N) SC: O(N)
    */

    public int firstUniqChar(String s) {
        int N = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }

        for (int i = 0; i < N; i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1)
                return i;
        }

        return -1;
    }
}