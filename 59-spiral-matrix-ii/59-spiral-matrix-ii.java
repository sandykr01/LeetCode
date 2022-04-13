class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = n-1;
        int val = 1;
        while(sr<=er && sc<=ec){
            
            // first fill the top row
            for(int i=sc;i<=ec;i++){
                ans[sr][i] = val;
                val++;
            }
            sr++;
            
            // now fill the last column
            for(int i=sr;i<=er;i++){
                ans[i][ec] = val;
                val++;
            }
            ec--;
            
            // now fill the bottom row
            for(int i=ec;i>=sc;i--){
                ans[er][i] = val;
                val++;
            }
            er--;
            
            // now fill the first column
            for(int i=er;i>=sr;i--){
                ans[i][sc] = val;
                val++;
            }
            sc++;
        }
        
        return ans;
    }
}