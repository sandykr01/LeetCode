class RandomizedCollection {
    
    Random r;
    HashMap<Integer,HashSet<Integer>> map;
    ArrayList<Integer> list;
    
    public RandomizedCollection() {
        r = new Random();
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        list.add(val);
        
        if(map.containsKey(val)){
            map.get(val).add(list.size()-1);
            return false;
        }else{
            HashSet<Integer> set = new HashSet<>();
            set.add(list.size()-1);
            map.put(val,set);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
       
        int v_idx = map.get(val).iterator().next();
        int l_idx = list.size()-1;
        int l_val = list.get(l_idx);
        
        list.set(l_idx,val);
        list.set(v_idx,l_val);
        
        list.remove(l_idx);
        
        map.get(val).remove(v_idx);
        if(map.get(val).size()==0){
            map.remove(val);
        }
        
        if(map.containsKey(l_val)){
            map.get(l_val).remove(l_idx);
            map.get(l_val).add(v_idx);
        }
        
        
        
        return true;
    }
    
    public int getRandom() {
        int idx = r.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */