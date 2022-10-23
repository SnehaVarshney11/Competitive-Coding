package Leetcode.OctDailyQues;

import java.util.HashSet;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int dup = 0, miss = 0;
        HashSet<Integer> set = new HashSet<>();
        
        // find duplicate using set
        for(int i = 0; i < nums.length; ++i){
            if(set.contains(nums[i]))   dup = nums[i];
            set.add(nums[i]);
        }
        
        // find missing
        for(int i = 1; i <= nums.length; ++i){
            if(set.contains(i) == false){
                miss = i;
                break;
            }
        }
        
        return new int[]{dup, miss};
    }
}
