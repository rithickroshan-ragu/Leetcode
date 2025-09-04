class Solution {
        /*
            Technique: Min Heap

            Step 1: add elements to min heap.
            Step 2: for every element check if the curr element is greated the the peek of min heap
            (smallest in heap). Then swap it , as it is the min in the array and smaller than curr  
            element.

            TC: O(N logN) SC: O(k)
        */

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int val = nums[i];
            if (q.size() < k) {
                q.add(val);
            } else {
                if (q.peek() < val) {
                    q.remove();
                    q.add(val);
                }
            }
        }

        return q.peek();
    }
}