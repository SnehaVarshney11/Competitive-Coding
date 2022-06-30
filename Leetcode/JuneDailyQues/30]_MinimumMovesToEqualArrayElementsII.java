package Leetcode.JuneDailyQues;

import java.util.Arrays;

class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int sum = nums[n/2];
        int res = 0;
        
        for(int i = 0; i < nums.length; i++){
            res += Math.abs(nums[i]-sum);
        }
        
        return res;
    }
}
