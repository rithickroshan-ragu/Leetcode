class Solution {
    /*
        Approach1:
        Technique: Dynamic Programming, Recursion

        1. Every day we have two option either to BUY/SELL stock or not do anythin. So try all
        possible combinations using recursion.
        2. Use DP to optimize the fucntion calls.

        TC: O(N * 2) SC: O(N * 2)

        ===================================================================

        Approach 2: Simpler , array traversal

        1. Simply travrese through the array and keep track of 
        lowestElementSoFar and profit = (currPrice - lowestElementSoFar). 

        TC: O(N) SC: O(1)
    */

    int BUY = 0;
    int SELL = 1;

    public int maxProfit(int[] prices) {
        // int N = prices.length;
        // int[][] dp = new int[N][2];
        // for (int[] arr: dp)
        // {
        //     Arrays.fill(arr, -1);
        // }
        // return transact(prices, 0, BUY, dp);

        int lowestPriceSoFar = Integer.MAX_VALUE;
        int profit = 0;
        for (int price: prices)
        {
            lowestPriceSoFar = Math.min(lowestPriceSoFar, price);
            profit = Math.max(profit, price - lowestPriceSoFar);
        }

        return profit;
    }

    int transact(int[] prices, int index, int signal, int[][] dp)
    {
        if (index == prices.length) return 0;
        if (dp[index][signal] != -1) return dp[index][signal];

        // Do not do any transaction
        int ans2 = transact(prices, index + 1, signal, dp);

        // Buy/Sell - do transaction
        int ans1 = 0;
        if (signal == BUY)
            ans1 = transact(prices, index + 1, SELL, dp) - prices[index];
        else
            ans1 = prices[index];


        return dp[index][signal] = Math.max(ans1, ans2);
    }
}