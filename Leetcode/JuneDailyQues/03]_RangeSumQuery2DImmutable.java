package Leetcode.JuneDailyQues;

class RangeSumQuery2DImmutable {
    int[][] dp;
    public void NumMatrix(int[][] matrix) {
        int m = matrix.length+1;
        int n = matrix[0].length+1;
        dp = new int[m][n];
    
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int r1 = dp[row2+1][col2+1];
        int r2 = dp[row1][col2+1] + dp[row2+1][col1];
        int r3 = dp[row1][col1];
        return r1 - r2 + r3;
    }
}
