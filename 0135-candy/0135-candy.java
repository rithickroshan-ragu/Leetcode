class Solution {
    /* Technique: Prefix & Suffix arrays/ Greedy
    
    Firtly issue all childrens 1 cholocolate. Now start from left and for every child give one
    more candy if his rating his more than prev child. Keep track of this in fromleft array.
    repeat the same from last and keep track in fromRight array. Now for every i ans =
    Max(left[i], right[i]).
    
    TC: O(N) SC:O(N)
    */

    public int candy(int[] ratings) {
        int N = ratings.length;
        int[] fromLeft = new int[N];
        int[] fromRight = new int[N];

        Arrays.fill(fromLeft, 1);
        Arrays.fill(fromRight, 1);

        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                fromLeft[i] = fromLeft[i - 1] + 1;
            }
        }

        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                fromRight[i] = fromRight[i + 1] + 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.max(fromLeft[i], fromRight[i]);
        }

        return ans;
    }
}