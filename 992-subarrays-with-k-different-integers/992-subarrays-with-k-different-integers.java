class Solution {
    public int getSubArrayWithAtMostK(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int i=0;
        int j=0;
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) map.remove(nums[j]);
                j++;
            }
            count+= i-j+1;
            i++;
        }
        return count;
    }
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        return getSubArrayWithAtMostK(nums,k)-getSubArrayWithAtMostK(nums,k-1);
    }
}