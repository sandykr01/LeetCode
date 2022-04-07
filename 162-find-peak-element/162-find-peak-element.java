class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int lo = 0;
        int hi = nums.length-1;
        
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if((mid==0 || nums[mid-1]<=nums[mid])&&(mid==nums.length-1 || nums[mid]>=nums[mid+1])){
                return mid;
            }
            else if(nums[mid]<=nums[mid+1]){
                lo = mid+1; 
            }
            else{
                hi = mid-1;
            }    
        }
        return -1;
    }
}