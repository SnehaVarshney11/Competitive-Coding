package Leetcode.JuneDailyQues;

class MinimumOperationsToReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0;
        for(int i = 0; i<n; i++) {
            totalSum += nums[i];
        }
        
        int findSubarraySum = totalSum - x;
        int start = 0;
        int currSum = 0;
        int maxLenSubArray = 0;
        for(int end = 0; end<n; end++) {
            currSum += nums[end];
            while(start<end && currSum > findSubarraySum) {
                currSum -= nums[start];
                start++;
            }
            
            if(currSum == findSubarraySum) {
                int currSubArrayLen = end-start+1;
                maxLenSubArray = Math.max(maxLenSubArray, currSubArrayLen);
            }
        }
        
        if(maxLenSubArray == 0 && totalSum != x) {
            return -1;
        }
        return n - maxLenSubArray;
    }
}
