class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int i=0;
        int j=0;
        int len = 0;
        int curr_fre = 0;
        int max_fre = 0;
        while(i<s.length()){
            map[s.charAt(i)-'A']++;
            curr_fre = map[s.charAt(i)-'A'];
            max_fre = Math.max(max_fre,curr_fre);
            while(i-j+1-max_fre>k){
                map[s.charAt(j)-'A']--;
                j++;
            }
            len = Math.max(len,i-j+1);
            i++;
        }
        return len;
    }
}