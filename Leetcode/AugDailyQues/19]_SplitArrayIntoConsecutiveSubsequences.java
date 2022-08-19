package Leetcode.AugDailyQues;

import java.util.HashMap;
import java.util.Map;

class SplitArrayIntoConsecutiveSubsequences {
    public boolean isPossible(int[] nums) {
        if (nums == null || nums.length < 3)
            return false;

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> tail = new HashMap<>();
    
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        
        for (int i : nums) {
            if (freq.get(i) == 0) {
                continue;
            }
            if (tail.get(i-1) != null && tail.get(i-1) > 0) {
                tail.put(i-1, tail.get(i-1) - 1);
                tail.put(i, tail.getOrDefault(i, 0) + 1);
                freq.put(i, freq.get(i) - 1);
            } else {
                if (freq.get(i+1) != null && freq.get(i+1) > 0 && 
                    freq.get(i+2) != null && freq.get(i+2) > 0) {
                    tail.put(i+2, tail.getOrDefault(i+2, 0) + 1);
                    freq.put(i, freq.get(i) - 1);
                    freq.put(i + 1, freq.get(i + 1) - 1);
                    freq.put(i + 2, freq.get(i + 2) - 1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
