package Leetcode.JulyDailyQues;

class OutOfBoundaryPaths {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (maxMove <= 0) {
            return 0;
        }
        
        final int MOD = 1000000007;
        
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        
        int result = 0;
        
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int step = 0; step < maxMove; step++) {
            int[][] temp = new int[m][n];
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    for (int[] d : dirs) {
                        int nr = r + d[0];
                        int nc = c + d[1];
                        if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                            result = (result + dp[r][c]) % MOD;
                        } else {
                            temp[nr][nc] = (temp[nr][nc] + dp[r][c]) % MOD;
                        }
                    }
                }
            }
            dp = temp;
        }
        
        return result;
    }
}
