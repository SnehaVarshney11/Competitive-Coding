package Leetcode.MayDailyQues;

class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, len = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                close++;
            }
            if(open == close){
                len = Math.max(len, open+close);
            }else if(close > open){
                open = close = 0;
            }
        }
        open = close = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }else{
                close++;
            }
            if(open == close){
                len = Math.max(len, open+close);
            }else if(close < open){
                open = close = 0;
            }
        }
        return len;
    }
}
