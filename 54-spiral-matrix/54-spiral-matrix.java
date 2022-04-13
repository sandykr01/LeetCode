class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;
        int size = matrix.length*matrix[0].length;
        int val = 1;
        while(sr<=er && sc<=ec){
            
            // first traverse the top row
            for(int i=sc;i<=ec && val<=size;i++){
                ans.add(matrix[sr][i]);
                val++;
            }
            sr++;
            
            // now fill the last column
            for(int i=sr;i<=er && val<=size;i++){
                ans.add(matrix[i][ec]);
                val++;
            }
            ec--;
            
            // now fill the bottom row
            for(int i=ec;i>=sc && val<=size;i--){
                ans.add(matrix[er][i]);
                val++;
            }
            er--;
            
            // now fill the first column
            for(int i=er;i>=sr && val<=size;i--){
                ans.add(matrix[i][sc]);
                val++;
            }
            sc++;
        }
        return ans;
    }
}