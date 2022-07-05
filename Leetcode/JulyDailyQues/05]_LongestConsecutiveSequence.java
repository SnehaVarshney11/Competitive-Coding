package Leetcode.JulyDailyQues;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int max = 0;
  
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
    
            // look left
            int num = nums[i];
            while (set.contains(--num)) {
                count++;
                set.remove(num);
            }
    
            // look right
            num = nums[i];
            while (set.contains(++num)) {
                    count++;
                    set.remove(num);
            }
    
            max = Math.max(max, count);
        }
        return max;
    }
}
