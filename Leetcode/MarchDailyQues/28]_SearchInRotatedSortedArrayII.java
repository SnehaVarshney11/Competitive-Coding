package MarchDailyQues;

class SearchInRotatedSortedArrayII{
    public boolean search(int[] nums, int target) {
        int low  = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            
            if(nums[low] ==  target || nums[high] == target)return true;
            
            else if(target > nums[low]){
                while(low < high && nums[low+1] == nums[low]){
                    low++;
                }
                low++;
            }
            else if(target < nums[high]){
                while(high > low && nums[high-1] == nums[high]){
                    high--;
                }
                high--;
            }
            else break;
        }
        return false;
    }
}