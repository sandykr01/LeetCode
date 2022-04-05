class RandomizedSet {
    
    Random r;
    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    
    public RandomizedSet() {
        r = new Random();
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        
        list.add(val);
        map.put(val,list.size()-1);
        
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int v_idx = map.get(val);
        int l_idx = list.size()-1;
        int l_val = list.get(l_idx);
        
        list.set(v_idx,l_val);
        list.set(l_idx,val);
        
        map.put(val,l_idx);
        map.put(l_val,v_idx);
        
        list.remove(list.size()-1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        int idx = r.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */