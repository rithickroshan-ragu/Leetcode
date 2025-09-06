class Solution {
    /*
        Technique: Two Pointers.
    
        Step 1: For every building, find the height of largest building to its left and right.
        Step 2: Now for every building caclculate the water that can be accumulated on top of it by
        Math.min(leftTallest, rightTallest) - height[i]
        Step 3: Sum of all these volume is the toltal water saved.
    
        TC: O(N) SC: O(N)
    */

    public int trap(int[] height) {
        int N = height.length;
        int[] right = new int[N];
        int[] left = new int[N];

        // Compute largest left
        left[0] = 0;
        int tallest = left[0];
        for (int i = 1; i < N; i++) {
            if (height[i] >= height[tallest]) {
                tallest = i;
            }
            // System.out.println("i = " + i + ", tallest = " + tallest);
            left[i] = tallest;
        }

        // Compute largest right
        right[N - 1] = N - 1;
        tallest = right[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            if (height[i] >= height[tallest])
                tallest = i;
            // System.out.println("i = " + i + ", tallest = " + tallest);
            right[i] = tallest;
        }

        int volume = 0;
        for (int i = 0; i < N; i++) {
            int tallestLeft = height[left[i]];
            int tallestRight = height[right[i]];
            // System.out.println(tallestLeft + " "+ tallestRight);

            volume += Math.min(tallestLeft, tallestRight) - height[i];
        }

        return volume;
    }
}