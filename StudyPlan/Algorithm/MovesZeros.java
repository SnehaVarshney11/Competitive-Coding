package StudyPlan.Algorithm;

class MovesZeros{
    public void moveZeroes(int[] nums) {
        int start = 0, end = 0;
        
        while(end < nums.length){
            if(nums[end] != 0){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start++;
            }
            end++;
        }
    }
}