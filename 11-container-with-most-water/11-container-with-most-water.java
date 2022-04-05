class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int max_area = 0;
        while(lo<hi){
            max_area = Math.max((Math.min(height[lo],height[hi]))*(hi-lo),max_area);
            if(height[lo]<height[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return max_area;
    }
}