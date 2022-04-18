class Solution {
    
    public int[] nextGreaterRight(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i=1;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                ans[st.pop()] = i;
            }
            st.push(i);
        }
        
        
        
        while(st.size()>0){
            for(int i=0;st.size()>0 && i<=st.peek();i++){
                if(nums[i]>nums[st.peek()]){
                    ans[st.pop()] = i;
                    break;
                }
                else if(i==st.peek()) ans[st.pop()] = -1;
            }
        }
        
        
        return ans;
    }
    
    
    public int[] nextGreaterElements(int[] nums) {
        int[] ngRight = nextGreaterRight(nums);
        
        int[] nextGreater = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(ngRight[i]>=0) nextGreater[i] = nums[ngRight[i]];
            else nextGreater[i] = -1;
        }
        
        return nextGreater;
        
    }
}