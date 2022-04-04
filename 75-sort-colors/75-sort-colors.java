class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int zero_area = 0; // area between zero and unknown is one's area
        int unknown_area = 0;
        int two_area = nums.length-1;
        while(unknown_area<=two_area){
            if(nums[unknown_area]==0){
                swap(nums,unknown_area,zero_area);
                unknown_area++;
                zero_area++;
            }else if(nums[unknown_area]==2){
                swap(nums,unknown_area,two_area);
                two_area--;
            }else if(nums[unknown_area]==1){
                unknown_area++;
            }
        }
    }
}