package MarchDailyQues;

import java.util.Arrays;

class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
