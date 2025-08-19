class Solution {
    /*
        Technique: HashMap
    
        1. store count of all characters in magazine in a hashmap.
        2. for every character in ransomNote check if the char exists in hashmap and redice the count.
        3. if all chars with req count is present return true else return false.
    
        TC: O(N)    SC: O(N)

        Approach 2: Using frequency array
    */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> chars = new HashMap<>();
        char[] arr = magazine.toCharArray();
        for (char c : arr) {
            if (chars.containsKey(c))
                chars.put(c, chars.get(c) + 1);
            else
                chars.put(c, 1);
        }

        arr = ransomNote.toCharArray();
        for (char c : arr) {
            if (!chars.containsKey(c)) {
                return false;
            } else {
                int remChars = chars.get(c);
                remChars--;
                if (remChars == 0)
                    chars.remove(c);
                else
                    chars.put(c, remChars);
            }
        }

        return true;
    }
}