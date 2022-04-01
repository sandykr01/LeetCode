class Solution {
    public int[] plusOne(int[] digits) {
        int rem=0;
        int c = 1;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=digits.length-1;i>=0;i--){
            int val = digits[i]+c;
            rem = val%10;
            ans.add(0,rem);
            c = val/10;
        }
        if(c!=0){
            ans.add(0,c);
        }
        
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}