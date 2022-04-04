class Solution {
    
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,i);
            }else{
                map.put(ch,i);
            }
        }
        
        // System.out.println(map);
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int pre = -1;
        int curr = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int reachOfCurr = map.get(ch);
            if(reachOfCurr>curr){
                curr = reachOfCurr;
            }
            if(curr==i){
                res.add(curr-pre);
                pre = curr;
            }
        }
        
        
        return res;
    }
}