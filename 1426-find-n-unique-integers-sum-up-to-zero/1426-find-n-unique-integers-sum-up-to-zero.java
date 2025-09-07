class Solution {
    /*
        Technique: Math
    
        You need n intergers that add up to 0. So start from 1 and keep adding integeres along with 
        its negative number to the array. if you need a odd length array finally add a 0 at the end.
    
        TC: O(N)    SC: O(1)
    */

    public int[] sumZero(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int size = 0, counter = 1;

        while (size + 2 <= n) {
            list.add(counter);
            list.add(-counter);
            size += 2;
            counter++;
        }

        if (size < n) {
            list.add(0);
            size++;
        }

        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}