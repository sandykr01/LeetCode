class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum = 0;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            map.put(sum,map.getOrDefault(sum,0)+1);
            // you have to add 0 sum because if any sum comes equal to k then sum-k = 0 
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
        }
        return count;
    }
}