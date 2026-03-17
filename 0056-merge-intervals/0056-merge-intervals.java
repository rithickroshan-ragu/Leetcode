class Solution {
    /*
        Steps: 
        1. Sort the intervals in ascending order of start time. 
        2. Start with one interval L and R.
        3. For second interval see if R2 is with L - R range. if yes merge them.
            Update L, R with max R
        4. Check for all intervals.
    
        TC: O(N)  SC: O(N)
    */

    public int[][] merge(int[][] intervals) {
        Comparator<int[]> cmp = (a, b) -> a[0] - b[0];
        Arrays.sort(intervals, cmp);

        ArrayList<int[]> ans = new ArrayList<>();
        int N = intervals.length;

        int L = intervals[0][0];
        int R = intervals[0][1];
        for (int i = 1; i < N; i++) {
            int L2 = intervals[i][0];
            int R2 = intervals[i][1];

            if (L2 <= R) {
                R = Math.max(R, R2);
            } else {
                ans.add(new int[] { L, R });
                L = L2;
                R = R2;
            }
        }

        ans.add(new int[] { L, R });

        int len = ans.size();
        int[][] temp = new int[len][];
        for (int i = 0; i < len; i++) {
            temp[i] = ans.get(i);
        }

        return temp;
    }
}