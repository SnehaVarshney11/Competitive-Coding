package StudyPlan.Algorithm;

import java.util.HashMap;

public class LongSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        int len=0, res=0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                len=0;
                i = map.get(s.charAt(i))+1;
                map.clear();
            }
            map.put(s.charAt(i),i);
            len++;
            res=Math.max(res,len);
        }
        return res;
    }
}
