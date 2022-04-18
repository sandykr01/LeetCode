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
        
        int[] n1Nge = new int[nums1.length];
        
        int[] n2Nge = nextGreater(nums2);
        
        
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(n2Nge[j]>0) n1Nge[i] = nums2[n2Nge[j]];
                    else n1Nge[i] = -1;
                    break;
                } 
            }
        }
        
        return n1Nge;
    }
}