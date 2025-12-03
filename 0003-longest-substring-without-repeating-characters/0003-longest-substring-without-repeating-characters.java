class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
            Technique: Two Pointers, HashSet
        
            step 1: Use two pointer left and right intilized to 0th index.
            step 2: Move right pointer and add elements to set. When an existing element is seen
                    remove elements from start of string (use left pointer) in the set, until you remove 
                    the duplicate element.
            step 3: Keep track of the size of set(unique substring elements) while doing this.
        
            TC: O(N)    SC: O(N)
        */

        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0, N = s.length();
        int max = 0;
        while (r < N) {
            char curr = s.charAt(r);
            while (set.contains(curr)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(curr);
            r++;
            max = Math.max(max, set.size());
        }

        return max;
    }
}