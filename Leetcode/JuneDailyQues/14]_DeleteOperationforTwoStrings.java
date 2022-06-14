package Leetcode.JuneDailyQues;

class Solution {
    public int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2*lcs(word1, word2);
    }
    public int lcs(String word1, String word2){
        int n = word1.length();
        int m = word2.length();
        int[][] t = new int[n+1][m+1];
        
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }
        return t[t.length - 1][t[0].length - 1];
    }
}