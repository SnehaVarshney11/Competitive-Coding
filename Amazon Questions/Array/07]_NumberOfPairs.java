class NumberOfPairs {
    static long countPairs(int x[], int y[], int M, int N)
    {
        // your code here
        long count = 0;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(Math.pow(x[i], y[j]) > Math.pow(y[j], x[i])){
                    count++;
                }
            }
        }
        return count;
    }
}
