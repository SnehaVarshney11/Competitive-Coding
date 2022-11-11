package Leetcode.NovemberDaily;

class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]){
                nums[count] = nums[i+1];
                count++;
            }
        }
        return count;
    }
}