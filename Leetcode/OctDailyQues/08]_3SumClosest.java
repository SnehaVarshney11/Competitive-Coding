package Leetcode.OctDailyQues;

import java.util.Arrays;

class SumClosest {
    private int closest(int target, int o, int n) {
        if(Math.abs(target-o) > Math.abs(target-n)) return n;
        return o;
    }
    
    public int threeSumClosest(int[] nums, int target) {
        int i = 0, j = 0, k = nums.length;
        int len = nums.length;
        Arrays.sort(nums);
        
        int ans = (int)(1e9);
        for(; i < len; i++) {
            j = i+1;
            k = len-1;
            //int tar = target-nums[i];
            
            while(j < k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target) return target;
                else if(sum > target) {
                    ans = closest(target,ans,sum);
                    k--;
                } else {
                    ans = closest(target,ans,sum);
                    j++;
                }
            }
        }
        
        return ans;
    }
}
