class Solution {
    /*
        Technique: HashSet
    
        1. Add all elements of first array to hashset.
        2. for each element in second array check if it is present in the set.
    
        TC: O(N) SC: O(N)
    */

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1)
            set.add(n);

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                list.add(n);
                set.remove(n);
            }
        }

        int sz = list.size();
        int[] ans = new int[sz];
        for (int i = 0; i < sz; i++)
            ans[i] = list.get(i);

        return ans;
    }
}