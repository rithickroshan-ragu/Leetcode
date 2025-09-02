class Solution {
    /*
        Technique: HashSet
    
        TC: O(N) SC: O(N)
    */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenElements = new HashSet<>();

        for (int n : nums) {
            if (seenElements.contains(n))
                return true;
            seenElements.add(n);
        }

        return false;
    }
}