package Leetcode.JuneDailyQues;

import java.util.HashSet;
import java.util.Set;

class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int l = 0, r = 0, sum = 0;
        Set<Integer> set = new HashSet<>();
        
        while(r < nums.length){
            if(set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }else{
                sum += nums[r];
                set.add(nums[r]);
                r++;
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}
