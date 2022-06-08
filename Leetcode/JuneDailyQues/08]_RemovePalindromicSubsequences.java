package Leetcode.JuneDailyQues;

class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        int count = 1;
        int last_index = s.length()-1;
        for(int i = 0;i < s.length();i++){
            if(last_index > i){
            char c0 = s.charAt(i);
            char c1 = s.charAt(last_index);
                if(c0!=c1){
                    count++;
                    break;
                }
              }
            last_index--;
       }
        return count;
    }
}
