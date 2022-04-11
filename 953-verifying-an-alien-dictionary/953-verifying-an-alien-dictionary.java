class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        
        // System.out.println(map);
        
        for(int i=1;i<words.length;i++){
            int smaller = words[i-1].length()<words[i].length()?words[i-1].length():words[i].length();
            
            for(int j=0;j<smaller;j++){
                int ch1 = map.get(words[i-1].charAt(j));
                int ch2 = map.get(words[i].charAt(j));
                if(ch1<ch2){
                    break;
                }
                else if(ch1==ch2){
                    if(j==smaller-1 && words[i-1].length()>words[i].length()) return false;
                    else continue;
                }
                else{
                    return false;
                }
            }
        }
        
        return true;
    }
}