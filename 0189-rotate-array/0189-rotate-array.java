class Solution {
    /*
        Technique: Two Pointers

        1. Reverse the entire array.
        2. Reverese the first k elements.
        3. Reverse the remaining elements.

        TC: O(N) SC: O(1)
    */

    public void rotate(int[] nums, int k) {
        int N = nums.length;
        k = k % N;

        reverse(nums, 0, N - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, N - 1);
    }

    void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}