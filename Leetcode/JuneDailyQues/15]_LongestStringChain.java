package Leetcode.JuneDailyQues;

import java.util.Arrays;
import java.util.HashMap;

class LongestStringChain{
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        HashMap<String, Integer> mp = new HashMap<>();
        int ans = 0;
        
        for(int i = 0; i < words.length; i++){
            int max = 0;
            
            for(int j = 0; j < words[i].length(); j++){
                String temp = words[i].substring(0, j) + words[i].substring(j + 1);
                
                if(mp.containsKey(temp)){
                    max = Math.max(mp.get(temp), max);
                }
            }
            
            mp.put(words[i], max + 1);
            ans = Math.max(ans, mp.get(words[i]));
        }
            
        return ans;
    }
}