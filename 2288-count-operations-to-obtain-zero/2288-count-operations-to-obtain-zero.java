class Solution {
    /*
        Technique - This is Eucledian's GCD aLGORITHM

        TC : O(log(min(num1,num2))) SC: O(1)
    */

    public int countOperations(int num1, int num2) {
        int operations = 0;
        if (num1 == 0 || num2 == 0) return operations;
        while (num1 > 0 && num2 > 0)
        {
            if (num1 == num2)
                return operations + 1;
            else if (num1 > num2)
            {
                int quo = num1 / num2;
                num1 = num1 - (num2 * quo);
                operations += quo;
            }
            else
            {
                int quo = num2 / num1;
                num2 = num2 - (num1 * quo);
                operations += quo;
            }
        }

        return operations;
    }
}