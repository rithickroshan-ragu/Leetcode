class Solution {
    /*
        Technique: simple array traversal
    
        TC: O(N) SC: O(1)
    */

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int N = hours.length;
        int employees = 0;
        for (int i : hours) {
            if (i >= target)
                employees++;
        }

        return employees;
    }
}