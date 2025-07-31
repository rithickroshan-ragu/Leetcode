class Solution {
    public int hIndex(int[] citations) {
        int N = citations.length;

        int[] count = new int[1000 + 1];
        for (int i: citations)
            count[i]++;

        int rem = N, len = count.length;
        int hIndex = 0;
        for (int i = 0; i < len; i++)
        {
            if (rem >= i)
            {
                hIndex = i;
                rem -= count[i];
            }
        }

        return hIndex;
    }
}