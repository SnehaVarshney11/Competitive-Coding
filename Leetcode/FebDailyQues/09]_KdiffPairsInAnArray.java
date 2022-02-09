package FebDailyQues;

import java.util.HashMap;
import java.util.Map;

class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for(int x : map.keySet()){
            if(k > 0 && map.containsKey(x + k) || k == 0 && map.get(x) > 1) count++;
        }
        return count;
    }
}
