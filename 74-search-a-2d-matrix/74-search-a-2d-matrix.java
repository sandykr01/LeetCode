class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int hi = (matrix.length*matrix[0].length)-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int r = mid/matrix[0].length;
            int c = mid%matrix[0].length;
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return false;
    }
}