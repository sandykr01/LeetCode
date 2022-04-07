class Solution {
    public int getFirst(int[] nums, int target){
        int ans = -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans = mid;
                hi = mid-1;
            }else if(nums[mid]<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
    
    public int getLast(int[] nums, int target){
        int ans = -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans = mid;
                lo = mid+1;
            }else if(nums[mid]<target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = getFirst(nums,target);
        ans[1] = getLast(nums,target);
        return ans;
    }
}