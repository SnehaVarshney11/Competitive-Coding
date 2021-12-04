package Love_Babbar_Cheat_Sheet.Array;

class JumpGame {
    public boolean canJump(int[] nums) {
        int lastIndexPos = nums.length - 1;
        
        for(int i = nums.length-1; i >= 0; i--){
            if(i + nums[i] >= lastIndexPos){
                lastIndexPos = i;
            }
        }
        return lastIndexPos == 0;
    }   
}
