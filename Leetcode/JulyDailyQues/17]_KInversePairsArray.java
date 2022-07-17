package Leetcode.JulyDailyQues;

class KInversePairsArray {
    public int kInversePairs(int n, int k) {
        int mod = 1000000007;
        int[][] ar = new int[k + 1][n];
        
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    ar[i][j] = 1;
                } else if (j > 0) {
                    ar[i][j] = (ar[i - 1][j] + ar[i][j - 1]) % mod;
                    if (i >= j + 1) {
                        ar[i][j] = (ar[i][j] - ar[i - j - 1][j - 1] + mod) % mod;
                    }
                }
            }
        }

        return ar[k][n - 1];
    }
}
