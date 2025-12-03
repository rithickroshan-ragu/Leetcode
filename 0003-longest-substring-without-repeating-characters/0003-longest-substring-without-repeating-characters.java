class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0, N = s.length();
        int max = 0;
        while (r < N)
        {
            char curr = s.charAt(r);
            while(set.contains(curr))
            {
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