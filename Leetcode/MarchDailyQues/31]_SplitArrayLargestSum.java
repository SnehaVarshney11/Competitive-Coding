package MarchDailyQues;

class SplitArrayLargestSum{
    public int splitArray(int[] nums, int m) {
        int right = 0;
        int left = 0;
        int result = 0;
        for(int n : nums)
        {
            right += n;
            left = Math.max(left, n); 
        }
        
        int mid = 0;
        while(left <= right)
        {
            mid = left + (right - left)/2;
            if(splitPossible(mid, nums, m))
            {
                result = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return result;
    }
    
    private boolean splitPossible(int largest, int[] nums, int m)
    {
        int subArray = 0;
        int sum = 0;
        
        for(int n : nums)
        {
            sum += n;
            if(sum > largest)
            {
                subArray += 1;
                sum = n;
            }
        }
        return (subArray + 1 <= m);
    }
}
