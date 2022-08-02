package August;

class EggDroppingPuzzle {
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    int[][] dp = new int[n+1][k+1];
	    
	    // n == 1 case in worst case I need to check every floor(k moves for k floors)
	    
	    for(int j=1; j<=k; ++j){
	        dp[1][j] = j;
	    }
	    // k = 0 , 0 moves , k = 1 , 1 move
	    for(int i=1; i<=n; ++i){
	        dp[i][0] = 0;
	        dp[i][1] = 1;
	    }
	    // 1 egg case and 1 floor base cases are done
	    for(int i=2; i<=n; ++i){
	        for(int j=2; j<=k; ++j){
	            int res = Integer.MAX_VALUE;
	            // I don't know where to start optimally like binary search in mid
	            // use dp and check all possiblilities
	            for(int t=1; t<=j; ++t){
	                // break
	                int temp1 = 1+dp[i-1][t-1]; // f is in [1,t-1]
	                // not break
	                int temp2 = 1+dp[i][j-t]; // f is in [t+1,k]
	                // take worst case
	                int ans = Math.max(temp1,temp2);
	                res = Math.min(res,ans);
	                
	            }
	            dp[i][j] = res;
	        }
	    }
	    return dp[n][k];
	}
}
