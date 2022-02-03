package FebDailyQues;

import java.util.HashMap;
import java.util.Map;

class SumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                map.put(-sum, map.getOrDefault(-sum, 0)+1);
            }
        }
        int count = 0;
        for(int p : nums3){
            for(int q : nums4){
                int sum = p+q;
                count += map.getOrDefault(sum, 0);
            }
        }
        return count;
    }
}
