class Solution {
    /*
        TC: O(N)  SC: O(1) 
    */

    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = 0, empty = 0;

        while (numBottles > 0) {
            drank += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty - (numBottles * numExchange);
        }

        return drank;
    }
}