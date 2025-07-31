class Solution {
    /*
        Technique: Counting
    
        Approach 1:
        Count the no.of.papers with i citations. After building the freq array now you can check 
        by traversing the freq array to find hIndex. for every pos see if at lease count[pos]
        papers are there which has >= citations.
    
        TC: O(N) SC: O(N)
    
        Approach 2: 
        Technique: Binary Search
        Do binary search on possible citations. since the max h_index cannot exceed 
        len of the citations array. So do a binary search and see if there are n papers with 
        more than mid citations and repeat the process.
    
        TC: O(N logN) SC: O(1)
    */

    public int hIndex(int[] citations) {
        int N = citations.length;

        int[] count = new int[1000 + 1];
        for (int i : citations)
            count[i]++;

        int rem = N, len = count.length;
        int hIndex = 0;
        for (int i = 0; i < len; i++) {
            if (rem >= i) {
                hIndex = i;
                rem -= count[i];
            }
        }

        return hIndex;
    }
}