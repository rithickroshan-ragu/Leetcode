class Solution {
    /*
        Technique: Two Pointers
    
        initialize two pointers (s,e) at start of array. Now move e ptr and add that type of fruit
        to the HashMap(basket). Keep count of each type of fruits added into the basket. Whenever
        you encounter a third type keep moving s ptr until you have only one type of fruit in the 
        basket. At every step keep track of maximum fruits in the basket.
    
        TC: O(N) SC: O(1)
    */
    public int totalFruit(int[] fruits) {
        int N = fruits.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0, e = 0;
        int total = 0, ans = 0;
        while (e < N) {
            int fruit = fruits[e];
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                if (map.size() < 2) {
                    map.put(fruit, 1);
                } else {
                    while (map.size() > 1) {
                        int fruit2 = fruits[s];
                        map.put(fruit2, map.get(fruit2) - 1);
                        total--;
                        s++;
                        if (map.get(fruit2) == 0)
                            map.remove(fruit2);
                    }
                    map.put(fruit, 1);
                }
            }
            total++;
            e++;

            ans = Math.max(ans, total);
        }

        return ans;
    }
}