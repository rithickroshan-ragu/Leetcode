class Solution {
    /*
        Technique: Two Pointers - In Place (keep one pointer to track where next valid element 
        must be stored and other for traversal)

        create two pointers pointing to end of both the arrays. Now compare both 
        the element and add the largest to end of nums1 array. Repeat the process 
        until one of the pointer goes out of bounds. Next include any unprocessed 
        elements from any of the arrays.
    
        TC: O(N + M) SC: O(1)
    */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        int ptr = n + m - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2])
                nums1[ptr--] = nums1[p1--];
            else
                nums1[ptr--] = nums2[p2--];
        }


        // Add unprocessed elements from any of the arrays
        if (p1 >= 0) {
            while (p1 >= 0)
                nums1[ptr--] = nums1[p1--];
        } else {
            while (p2 >= 0)
                nums1[ptr--] = nums2[p2--];
        }
    }
}