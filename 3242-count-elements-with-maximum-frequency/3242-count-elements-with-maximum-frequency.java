class Solution {
    /*
        Technique: Frequency Array
    
        Step 1: Create a frequency array and capture the frequency of all elements in the nums array.
        Step 2: While doign so, keep track of the maxFrequqncy till now and count any element with
                maxFreq towards the answer.
    
        TC: O(N)    SC: O(1)
    */

    public int maxFrequencyElements(int[] nums) {
        int N = nums.length;
        int[] freq = new int[101];

        int count = 0, maxFreq = 0;
        for (int i : nums) {
            freq[i]++;
            if (freq[i] == maxFreq) {
                count += freq[i];
            } else if (freq[i] > maxFreq) {
                count = freq[i];
                maxFreq = freq[i];
            }
        }

        return count;
    }
}