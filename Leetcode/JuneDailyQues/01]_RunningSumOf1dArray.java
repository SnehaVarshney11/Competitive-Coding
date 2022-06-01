package Leetcode.JuneDailyQues;

class RunningSum{
    public int[] runningSum(int[] nums) {
        int[] ar = new int[nums.length];
        ar[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            ar[i] = ar[i-1] + nums[i];
        }
        return ar;
    }
}