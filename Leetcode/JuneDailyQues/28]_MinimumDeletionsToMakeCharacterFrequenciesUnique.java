package Leetcode.JuneDailyQues;

import java.util.HashSet;

class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        int[] ch = new int[26];
        
        for(char c : s.toCharArray()){
            ch[ c - 'a'] ++;
        }
        
        HashSet<Integer> hs = new HashSet<>();
       
        int del = 0;
        
        for(int val : ch){
            while(val != 0 && hs.contains(val)){
                val--;
                del++;
            }
            hs.add(val);          
        }
       
        return del;
    }
}
