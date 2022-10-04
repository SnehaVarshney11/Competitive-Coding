package October;

class CountAllPossiblePathsFromTopLeftToBottomRight {
    int mod=(int)1e9+7;

    int f(int i,int j,int dp[][])

    {

        if(i==0&&j==0) return 1;

        if(i<0||j<0) return 0;

        if(dp[i][j]!=0) return dp[i][j];

        int up=f(i-1,j,dp);

        int left=f(i,j-1,dp);

        return dp[i][j]=(up+left)%mod;

    }

    long numberOfPaths(int m, int n)

    {

        // code here

        int dp[][]=new int[m][n];

        return f(m-1,n-1,dp);

    }
}
