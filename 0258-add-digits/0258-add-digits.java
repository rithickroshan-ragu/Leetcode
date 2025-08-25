class Solution {
    /*
        Approach 1: Repeatedly sum the no until it has one digit.
        TC: O(log n)^^2 SC: O(1)
    
        Approach 2: Digital root of a number
        TC: O(1)    SC: O(1)
    */

    public int addDigits(int num) {
        // Approach 1
        // while (num > 10) {
        //     num = sumDigits(num);
        // }

        // return num;

        // Approach 2
        if (num == 0)
            return 0;
        return 1 + (num - 1) % 9;
    }

    int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}