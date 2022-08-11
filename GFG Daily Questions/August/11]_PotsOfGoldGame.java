package August;

import java.util.Arrays;

class PotsOfGoldGame {
    public static int maxCoins(int A[],int n)
	{
          //add code here.
        int dp[][]=new int[n][n];
        for(int row[]:dp){
        Arrays.fill(row,-1);
        }
        return helper(A,n,0,n-1,dp);
    }
        
    static int helper(int A[],int n,int start,int end,int dp[][]){
        if(start==end)
            return dp[start][end]=A[start];
        if(start+1==end)
            return dp[start][end]=Math.max(A[start],A[end]);
        if(dp[start][end]!=-1)
            return dp[start][end];
        return dp[start][end]=Math.max(A[start]+Math.min(helper(A,n,start+2,end,dp),helper(A,n,start+1,end-1,dp)),A[end]+Math.min(helper(A,n,start+1,end-1,dp),helper(A,n,start,end-2,dp)));
    }
}
