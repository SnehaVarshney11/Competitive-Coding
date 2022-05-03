package GFG Daily Questions.May;

class SubsetsWithXORvalue {
    static int subsetXOR(int arr[], int N, int K) {
        // code here
        int max_element = arr[0];
        for(int i = 1; i < N; i++){
            if(arr[i] > max_element){
                max_element = arr[i];
            }
        }
        int max = 10*max_element;
        int[][] dp = new int[N+1][max+1];
        dp[0][0] = 1;
        
        for(int i=1;i<=N;i++){
            for(int j=0;j<=max;j++){
                dp[i][j] += dp[i-1][j]; 
                if((j^arr[i-1])<=max){
                    dp[i][j] += dp[i-1][j^arr[i-1]];
                }
            }
        }
        return dp[N][K];
    }
}
