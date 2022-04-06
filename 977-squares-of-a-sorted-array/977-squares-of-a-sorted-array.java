class Solution {
    public int[] sortedSquares(int[] nums) {
        int low  = 0;
        int high = nums.length-1;
       
        int[] ans = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[low])>nums[high]){
                ans[i] = nums[low]*nums[low];
                low++;
            }else{
                ans[i] = nums[high]*nums[high];
                high--;
            }
        }
        return ans;
        
    }
}