class ShortestUnsortedContinuousSubarray{
    public int findUnsortedSubarray(int[] nums) {
        int[] sort_ar = nums.clone();
        Arrays.sort(sort_ar);
        
        int l = -1, h = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != sort_ar[i]){
                l = i;
                break;
            }
        }
        for(int j = nums.length-1; j >= 0; j--){
            if(nums[j] != sort_ar[j]){
                h = j;
                break;
            }
        }
        if(l == h) return 0;
        return h-l+1;
    }
}