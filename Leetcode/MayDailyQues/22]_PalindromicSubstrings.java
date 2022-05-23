package Leetcode.MayDailyQues;

class PalindromicSubstrings {
    public int countSubstrings(String s) {
        char[] ch = s.toCharArray();
        int size = s.length();
        int count = 0;
        
        for(int i = 0; i < size; i++){
            for(int s_i = i, e_i = i; s_i >= 0 && e_i < size && ch[s_i--] == ch[e_i++];){
                count++;
            }
            for(int s_i = i, e_i = i+1; s_i >= 0 && e_i < size && ch[s_i--] == ch[e_i++];){
                count++;
            }
        }
        return count;
    }
}
