class Solution {
    
    public int[] nextGreater(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[nums.length];
        st.push(0);
        for(int i=1;i<nums.length;i++){
            while(st.size()>0 && nums[st.peek()]<nums[i]){
                nge[st.pop()] = i;
            }
            st.push(i);
        }
        
        while(st.size()>0){
            nge[st.pop()] = -1;
        }
        
        return nge;
        
    }
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        
        int[] n2Nge = nextGreater(nums2);
        
        HashMap<Integer,Integer> mapOfNum2 = new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            mapOfNum2.put(nums2[i],i);  // storing value and indices
        }
        
        
        for(int i=0;i<nums1.length;i++){
            int posInNum2 = mapOfNum2.get(nums1[i]);
            if(n2Nge[posInNum2]>0) ans[i] = nums2[n2Nge[posInNum2]];
            else ans[i] = -1;

        }
        
        return ans;
    }
}