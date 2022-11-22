package Leetcode.NovemberDaily;

import java.util.Arrays;

class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n, dp);
    }
    int func(int n, int[] dp){
        if(dp[n] != -1)
            return dp[n];
        if(n == 0) return 0;
        
        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n; i++){
            int curr = func(n - i * i, dp) + 1;
            min = Math.min(min, curr);
        }
        return dp[n] = min;
    }
}
