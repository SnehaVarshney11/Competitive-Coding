package June;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SmallestFDistinctWindow {
    public int findSubString( String str) {
        // Your code goes here
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        int i = 0, j = 0, ans = str.length();
        for(j = 0; j < str.length(); j++){
            map.put(str.charAt(j),map.getOrDefault(str.charAt(j), 0) + 1);
            while(map.size() == set.size()){
                ans = Math.min(ans, j-i+1);
                map.put(str.charAt(i), map.get(str.charAt(i))-1);
                 if(map.get(str.charAt(i)) == 0)
                       map.remove(str.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
