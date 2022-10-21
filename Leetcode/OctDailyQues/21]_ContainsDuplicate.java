package Leetcode.OctDailyQues;

import java.util.HashMap;

class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current) && i-map.get(current)<=k){
                return true;
            } else{
                map.put(current, i);
            }
        }
        return false;
    }
}
