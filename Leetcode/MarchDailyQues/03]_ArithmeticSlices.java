package MarchDailyQues;

class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        
        //base case
        if(n < 3) return 0;
        
        int totalCount = 0;
        int difference = nums[1] - nums[0];
        int start = 0;
        int end = 2;
        
        while(end < n){
            if(nums[end] - nums[end - 1] == difference){
                end++;
                continue;
            }
            totalCount += getCount(end - start);
            
            //new Diff
            difference = nums[end] - nums[end-1];
            
            start = end - 1;
            end = end + 1;
        }
        totalCount += getCount(end - start);
        return totalCount;
    }
    private int getCount(int len){
        if(len <= 2) return 0;
        
        return ((len-2) * ((len-2) + 1))/2;
    
    }
}
