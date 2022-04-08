class Solution {
    
    public boolean isPossible(int[] nums, int pot_ans, int partition){
        int sum = 0;
        int split = 1;
        for(int val : nums){
            sum+=val;
            if(sum>pot_ans){
               split++;
                sum = val;
            }
        }
        if(split<=partition){
            return true;
        }
        return false;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        
        for(int val : weights){
            sum+=val;
            mx = Math.max(mx,val);
        }
        
        int low = mx;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;
    }
}