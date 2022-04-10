class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length+nums2.length;
       
         if(nums1.length>nums2.length){ // always keeping our nums1 array as smaller to avoid -ve indices
                int[] temp = nums1;
                nums1 = nums2;
                nums2 = temp;
         }
            
            int lo = 0;
            int hi = nums1.length;
            
            while(lo<=hi){
                int nums1mid = lo+(hi-lo)/2;
                int nums2mid = (size+1)/2-nums1mid;
                
                int n1MidMinus1 = (nums1mid<=0)?Integer.MIN_VALUE:nums1[nums1mid-1];
                int n1Mid = (nums1mid>=nums1.length)?Integer.MAX_VALUE:nums1[nums1mid];
                int n2MidMinus1 = (nums2mid<=0)?Integer.MIN_VALUE:nums2[nums2mid-1];
                int n2Mid = (nums2mid>=nums2.length)?Integer.MAX_VALUE:nums2[nums2mid];
                
                
                if(n1MidMinus1<=n2Mid && n2MidMinus1<=n1Mid){
                    
                    if(size%2==0){
                        int firstMedian = Math.max(n1MidMinus1,n2MidMinus1);
                        int secondMedian = Math.min(n1Mid,n2Mid);
                        return (double)(firstMedian+secondMedian)/2.0;
                    }
                    else{
                        return Math.max(n1MidMinus1,n2MidMinus1);
                    }

                }
                else if(n1MidMinus1>n2Mid){
                    hi = nums1mid-1;
                }
                else if(n2MidMinus1>n1Mid){
                    lo = nums1mid+1;
                }
            }
            
           return 0; 
        
    }
}


