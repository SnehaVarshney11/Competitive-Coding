package June;

class NumberOfWays {
    static long arrangeTiles(int N){
        // code here
        long[] dp = new long[N+1];
        dp[0] = 1;
        
        for(int i = 1; i <= N; i++){
            dp[i] = dp[i-1];
            if(i-4 >= 0){
                dp[i] += dp[i-4];
            }
        }
        return dp[N];
    }
}
