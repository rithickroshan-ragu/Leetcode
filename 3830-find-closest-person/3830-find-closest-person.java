class Solution {
    public int findClosest(int x, int y, int z) {
        int personXsteps = Math.abs(x - z);
        int personYsteps = Math.abs(y - z);

        if (personXsteps < personYsteps)
            return 1;
        else if (personYsteps < personXsteps)
            return 2;
        else
            return 0;
    }
}