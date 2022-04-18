class Solution {
    
    public int[] nextGreaterRightCircular(int[] nums){
        int n = nums.length;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i=1;i<n*2;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i%n]){
                ans[st.pop()] = nums[i%n];
            }
            st.push(i%n);
        }
        
        return ans;
    }
    
    
    public int[] nextGreaterElements(int[] nums) {
        int[] ngRight = nextGreaterRightCircular(nums);
        
        return ngRight;
        
    }
}