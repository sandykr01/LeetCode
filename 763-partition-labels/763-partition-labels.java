class Solution {
    
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a'] = i;
        }
        
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        int pre = -1;
        int curr = 0;
        for(int i=0;i<s.length();i++){
            
            int reachOfCurr = map[s.charAt(i)-'a'];
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