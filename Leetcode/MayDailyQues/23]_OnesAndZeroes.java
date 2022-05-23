package Leetcode.MayDailyQues;

class Solution {
    //create a 2d array 
    int[][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m+1][n+1];
        
        for(String s: strs){
            int[] count = countNo(s);
            //zero -> m-count[0] till 0
            //one -> n-count[1] till 0
            for(int z = m; z >= count[0]; z--){
                for(int o = n; o >= count[1]; o--){
                    dp[z][o] = Math.max(dp[z-count[0]][o-count[1]] + 1, dp[z][o]);
                }
            }
        }
        return dp[m][n];
    }
    int[] countNo(String str){
        int[] ar = new int[2];
        for(char ch : str.toCharArray()){
            ar[ch - '0']++;
        }
        return ar;
    }
}