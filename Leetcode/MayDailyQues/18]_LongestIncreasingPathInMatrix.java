package Leetcode.MayDailyQues;

class LongestIncreasingPathInMatrix {
    private static final int[] DIR_X = new int[]{-1,0,1,0};
    private static final int[] DIR_Y = new int[]{0,1,0,-1};
    
    public int longestIncreasingPath(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = 0;
        int[][] dp = new int[m][n];        
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                max = Math.max(max, longestIncreasingPath(matrix, m, n, i, j, dp));
            }
        }
        return max;
    }
    private int longestIncreasingPath(int[][] matrix, int m, int n, int x, int y, int[][] dp) {
        if( dp[x][y] != 0 ) return dp[x][y];
        
        int max = 0;
        
        for(int i=0; i<4; i++) {
            int dx = x + DIR_X[i];
            int dy = y + DIR_Y[i];
            
            if( dx < 0 || dy < 0 || dx >= m || dy >= n || matrix[x][y] >= matrix[dx][dy])
                continue;
            
            max = Math.max( max, longestIncreasingPath(matrix, m, n, dx, dy, dp) );
        }
        return dp[x][y] = max+1;
    }
}
