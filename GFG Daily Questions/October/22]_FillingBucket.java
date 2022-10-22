package October;

class FillingBucket {
    static int fillingBucket(int N) {
        // code here
        if(N<=2) return N;

        int[] dp=new int[N+1];

        dp[0]=1;

        dp[1]=2;

        for(int i=2;i<N;i++)

            dp[i] = (dp[i-1]+dp[i-2])%100000000;

        return dp[N-1];
    }
}
