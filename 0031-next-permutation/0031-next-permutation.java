class Solution {
    /*
        Technique: Two Pointers, Math
    
        Step 1: Start from end of array and find the position of element where the pairs are in  
        ascending order.
        Step 2: Swap that element with that next largest element from right portion of the array.
        Staep 3: Now reverse the array from pos + 1 to end of array to get the next smallest 
        permutation.
    
        TC: O(N)    SC: O(1)
    */

    public void nextPermutation(int[] nums) {
        int N = nums.length;

        // Step 1
        int pos = -1, prev = nums[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            if (nums[i] < prev) {
                pos = i;
                break;
            }
            prev = nums[i];
        }

        if (pos == -1) {
            reverse(nums, 0, N - 1);
            return;
        }

        // Step 2
        int justLargest = pos + 1;
        for (int i = pos + 2; i < N; i++) {
            if (nums[i] > nums[pos])
                justLargest = i;
        }
        swap(nums, pos, justLargest);
        // Step 3
        reverse(nums, pos + 1, N - 1);
    }

    void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    void swap(int arr[], int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}