package Leetcode.JuneDailyQues;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, end);
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}
