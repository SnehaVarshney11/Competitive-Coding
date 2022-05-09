class ProbabilityOfKnight {
    boolean isValid(int r, int c, int n) {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            return false;
        }
        return true;
    }

     int[][] direction = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

    
    public double findProb(int n, int r, int c, int k)
    {
        // Code here
        double[][][]dp = new double[k+1][n][n];
        
        dp[0][r][c] = 1;
        
        for(int step=1; step<=k; step++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    
                    for(int[]dir : direction){
                        int oldrow = i + dir[0];
                        int oldcol = j + dir[1];
                        
                        if(isValid(oldrow, oldcol, n)){
                            dp[step][i][j] += dp[step-1][oldrow][oldcol]/8.0;
                        }
                    }
                }
            }
        }
        
        double res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                res += dp[k][i][j];
            }
        }

        return res;
    }
}
