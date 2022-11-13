package Leetcode.NovemberDaily;

class ReverseWords {
    public String reverseWords(String s) {
        String res = new String();
        int i = 0;
        int n = s.length();
        while(i < n){
            while(i<n && s.charAt(i) == ' ')
                i++;
            if(i >= n) break;
            int j = i + 1;
            while(j<n && s.charAt(j) != ' '){
                j++;
            }
            String sub = s.substring(i, j);
            if(res.length() == 0) 
                res = sub;
            else
                res = sub + " " + res;
            i = j+1;
        }
        return res;
    }
}
