package Leetcode.SepDailyQues;

class ReverseWords {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            if(c[j] == ' '){
                reverse(c, i, j-1);
                i = j+1;
            }
        }
        reverse(c, i, c.length-1);
        return new String(c);
    }
    public void reverse(char[] s, int l, int r){
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
