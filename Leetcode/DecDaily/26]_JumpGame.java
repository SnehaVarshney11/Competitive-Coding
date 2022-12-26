package Leetcode.DecDaily;

class JumpGame {
    public boolean canJump(int[] nums) {
        int sum = 0;
        if(nums.length == 1){
            return true;
        }
        for(int i = 0; i < nums.length-1 && sum >= i; i++){
            if(sum < i+nums[i]){
                sum = i+nums[i];
            }
            if(sum >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}
