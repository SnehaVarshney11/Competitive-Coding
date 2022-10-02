package Leetcode.OctDailyQues;

class NumberOfDiceRollsWithTargetSum {
    public int numRollsToTarget(int n, int k, int target) {
        if(target>k*n) {
        return 0;
    }
    
    int modulo = (int)Math.pow(10,9)+7;
    
    int[][] dp = new int[n+1][target+1];
    dp[0][0] = 1;
    
    for(int i=1;i<=n;i++){
        for(int j=0;j<=target;j++){
            for(int x=1;x<=k;x++){
                if(j-x<0) 
                    continue;
                dp[i][j] = (dp[i][j] + dp[i-1][j-x])% modulo;
            }
        }
    }
    
    return dp[n][target];
    }
}
