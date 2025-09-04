class Solution {
    /*
        Technique: Floyd's cycle finding algorithm or Hare-Tortoise algorithm
    
        Step 1: Use slow and fast top find the point of intersection and to prove the cycle.
        Step 2: Use two slow pointer then. one from point of intersectiona dn one from start of array
        to find the start of cycle.
    
        TC: O(N) SC: O(1)
    */

    public int findDuplicate(int[] nums) {
        int tortoise = 0;
        int hare = 0;

        // Step 1
        while (true) {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare)
                break;
        }

        // step 2
        int tortoise1 = 0;
        int tortoise2 = tortoise;

        while (true) {
            tortoise1 = nums[tortoise1];
            tortoise2 = nums[tortoise2];
            if (tortoise1 == tortoise2)
                break;
        }

        return tortoise1;
    }
}