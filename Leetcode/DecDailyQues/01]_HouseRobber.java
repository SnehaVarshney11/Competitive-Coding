package DecDailyQues;

class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        
        if(nums.length == 1) return nums[0];
        
        int[] mark = new int[nums.length];
        mark[0] = nums[0];
        mark[1] = Math.max(nums[0], nums[1]);
        
        for(int i=2; i<nums.length; i++){
            mark[i] = Math.max(mark[i-2] + nums[i], mark[i-1]);
        }
        return mark[nums.length - 1];
    }    
}
