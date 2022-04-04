class Solution {
    
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }
        
        // System.out.println(map);
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int pre = -1;
        int curr = 0;
        for(int i=0;i<s.length();i++){
            
            int reachOfCurr = map.get(s.charAt(i));
            curr = Math.max(curr,reachOfCurr);
                
            if(curr==i){
                res.add(curr-pre);
                pre = curr;
            }
        }
        
        
        return res;
    }
}