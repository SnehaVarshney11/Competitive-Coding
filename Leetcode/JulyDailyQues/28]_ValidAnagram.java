package Leetcode.JulyDailyQues;

import java.util.Arrays;

class ValidAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            a1[s.charAt(i) - 'a']++;
            a2[t.charAt(i) - 'a']++;
        }
        if(Arrays.equals(a1, a2)){
            return true;
        }
        return false;
    }   
}