import java.util.Arrays;

class BrokenBlocks {
    public int helper(int i, int j, int m, int n, int[][] matrix, int[][] dp){
        if(i >= m || j >= n || i < 0 ||  j < 0) return 0;
        if(matrix[i][j] == -1) return 0;
        if(dp[i][j] != -2) return dp[i][j];
        int down = helper(i+1, j, m, n, matrix, dp);
        int left = helper(i+1, j+1, m, n, matrix, dp);
        int right = helper(i+1, j-1, m, n, matrix, dp);
        return dp[i][j] = matrix[i][j] + Math.max(down, Math.max(left, right));
    }
    public int MaxGold(int[][] matrix)
    {
        // Code here
        int m = matrix.length, n = matrix[0].length;
        int ans=0;
        int[][] dp=new int[m+1][n+1];
        for(int[] row : dp)
            Arrays.fill(row, -2);
        for(int i = 0; i < n; i++)
            ans = Math.max(ans, helper(0, i, m, n, matrix, dp));
        return ans;
    }
}
