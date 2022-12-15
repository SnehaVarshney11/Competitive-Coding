package Leetcode.DecDaily;

class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        dp[0][0] = 0;
        
        int max = 0;
        
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}
