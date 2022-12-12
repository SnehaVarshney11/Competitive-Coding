package Leetcode.DecDaily;

class PathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[][] dp = new int[n][m];
        
        //fill the last row of dp same as matrix
        for(int i = 0; i < m; i++){
            dp[n-1][i] = matrix[n-1][i];
        }
        
        for(int i = n-2; i >= 0; i--){
            for(int j = 0; j < m; j++){
                dp[i][j] = matrix[i][j];
                int mn = dp[i+1][j];
                
                if(j+1 < m){ //down right
                    mn = Math.min(mn, dp[i+1][j+1]);
                }
                if(j-1 >= 0){ //down left
                    mn = Math.min(mn, dp[i+1][j-1]);
                }
                
                dp[i][j] += mn;
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            res = Math.min(dp[0][i], res);
        }
        return res;
    }    
}
