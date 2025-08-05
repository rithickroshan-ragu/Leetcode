class RandomizedSet {
    /*
        Technique: HashMap and ArrayList
    
        If we use an HashSet directly, we can insert and remove in O(1) time but we cannot get random
        in O(1) time. For that we will need to convert the set into a list in order to get some random
        elements. But this conversion takes O(N) time.
    
        So instead use a combination of HashMap and ArrayList
        1. Use ArrayList to store the values.
        2. Use HashMap to store the elements and its correspoding position in list.
    
        Now insertion and removal are O(1) as before. For removal you can now find the postion of
        the element in the list and swap to last of list. Now remove the last element and its entry
        from hashmap. 
        Now for getRandom you can generate a rendom index in the range [0, list.size() - 1] and pick
        that element from list.
    
        Now all operations are of TC: O(1)
    */

    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            swapToLast(val);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
    }

    public void swapToLast(int val) {
        if (map.get(val) == list.size() - 1) {
            return;
        } else {
            // Get two indexes
            int i1 = map.get(val);
            int i2 = list.size() - 1;

            // Get two elements
            int e1 = list.get(i1);
            int e2 = list.get(i2);

            // swap elements in position
            list.set(i1, e2);
            list.set(i2, e1);

            // Update the same in map
            map.put(e1, i2);
            map.put(e2, i1);
        }
    }

    public int getRandom() {
        Random r = new Random();
        int index = r.nextInt(list.size());

        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */