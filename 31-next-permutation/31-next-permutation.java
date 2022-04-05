class Solution {
    public void reverse(int[]nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    } 
    
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1 = i;
                break;
            }
        }
        
        if(idx1!=-1){
            int idx2 = -1;
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[idx1]){
                    idx2 = i;
                    break;
                }
            }
            swap(nums,idx1,idx2);
            reverse(nums,idx1+1,nums.length-1);  
        }else{
            reverse(nums,0,nums.length-1);
        }
                
    }
}