class Solution {
    /*
        Technique: Two Pointers
    
        1. Initialize two pointers at start and end of array (l,r)
        2. Calculate sum for the two elemenst at the positions l and r.
        3. if sum == target return
        else if sum < target move l pointer forward as this increase the total sum (array in 
        ascending order).
        else move r backwards.
    
        TC: O(N)    SC: O(1)
        */
    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        int l = 0, r = N - 1;
        int a = -1, b = -1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                a = l + 1;
                b = r + 1;
                break;
            } else if (sum < target)
                l++;
            else
                r--;
        }

        return new int[] { a, b };
    }
}