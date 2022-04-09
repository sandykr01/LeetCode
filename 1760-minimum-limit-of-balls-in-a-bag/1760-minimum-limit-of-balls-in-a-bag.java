class Solution {  // This question is the variation of Allocate Minimum books
    public boolean isPossible(int[] nums, int potential_penalty, int maxOperations){
        int operations=0;
        for(int i=0;i<nums.length;i++){
            operations += nums[i]/potential_penalty;
            if(nums[i]%potential_penalty==0) operations--;
        }
        return operations<=maxOperations;
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        int mx = Integer.MIN_VALUE;
        
        for(int val:nums){
            mx = Math.max(mx,val);
        }
        
        int lo = 1;
        int hi = mx;
        int ans = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(nums,mid,maxOperations)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        
        return ans;
    }
}