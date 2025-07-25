class Solution {
    /*
        Technique: Dynamic Programming, Recursion

        For every day we have two option either to Buy/ Sell stock. And we can do multiple such
        transactions, also we can sell it on the same day. So try all possible cases and optimize
        with DP.

        Key Idea: After selling and making profit move to follow up days to do further trades.

        TC: O(N * 2) SC: O(N * 2)
    */

    int BUY = 0;
    int SELL = 1;
    public int maxProfit(int[] prices) {
        int N = prices.length;
        int[][] dp = new int[N][2];
        for (int[] arr: dp)
            Arrays.fill(arr, -1);
        return transact(prices, 0, BUY, dp);
    }

    int transact(int[] prices, int index, int signal, int[][] dp)
    {
        if (index == prices.length) return 0;
        if (dp[index][signal] != -1) return dp[index][signal];

        // BUY/SELL stock today
        int ans1 = 0;
        if (signal == BUY)
            ans1 = Math.max(ans1, -prices[index] + transact(prices, index + 1, SELL, dp));
        else
            ans1 = prices[index] + transact(prices, index + 1, BUY, dp);

        // Do not do any transaction
        int ans2 = transact(prices, index + 1, signal, dp);

        return dp[index][signal] = Math.max(ans1, ans2);
    }
}