package July;

import java.util.Arrays;

class LevelsOfGame {
    public static int maxLevel_dp(int h, int m, int[][] dp, boolean flag) {
        if(h <= 0 || m <= 0)
            return -1;
            
        if(dp[h][m] != -1)
            return dp[h][m];
            
        if(flag) {
            flag = false;
            return dp[h][m] = maxLevel_dp(h + 3, m + 2, dp, flag) + 1;
        } else {
            flag = true;
            return dp[h][m] = Math.max(maxLevel_dp(h - 5, m - 10, dp, flag), maxLevel_dp(h - 20, m + 5, dp, flag)) + 1;
        }
    }
    
    public static int maxLevel(int h,int m) {
        int[][] dp = new int[2001][2001];
        for(int[] d : dp)
            Arrays.fill(d, -1);
        
        return maxLevel_dp(h, m, dp, true);
    }
}
