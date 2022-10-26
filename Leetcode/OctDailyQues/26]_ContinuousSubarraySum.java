package Leetcode.OctDailyQues;

import java.util.HashSet;
import java.util.Set;

class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Set<Integer> modSet=new HashSet<>();
        int currSum = 0, prevSum=0; 
        for(int n : nums) {
            currSum += n;
            if(modSet.contains(currSum%k)) {
                return true;
            }
            currSum %=k;
            modSet.add(prevSum);
            prevSum = currSum;
        }
        return false;
    }
}
