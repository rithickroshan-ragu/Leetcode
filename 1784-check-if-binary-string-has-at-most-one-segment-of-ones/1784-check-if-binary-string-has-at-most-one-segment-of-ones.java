class Solution {
    /*
        TC: O(N)
        SC: O(1)
    */

    public boolean checkOnesSegment(String s) {
        //1. Count no.of ones
        int count = countOnes(s);
        int N = s.length();

        int ones = 1;
        for (int i = 1; i < N; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                if (ones == count)
                    return true;
                else
                    return false;
            }
        }

        return true;
    }

    int countOnes(String s) {
        int N = s.length();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '1')
                count++;
        }

        return count;
    }
}
