class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[n + m];
        int p1 = 0, p2 = 0;
        int ptr = 0;
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2])
                temp[ptr++] = nums1[p1++];
            else
                temp[ptr++] = nums2[p2++];
        }

        // Add unprocessed elements from any of the arrays
        if (p1 < m) {
            while (p1 < m)
                temp[ptr++] = nums1[p1++];
        } else {
            while (p2 < n)
                temp[ptr++] = nums2[p2++];
        }

        // Copy back temp array to nums1
        int len = n + m;
        for (int i = 0; i < len; i++)
            nums1[i] = temp[i];

    }
}