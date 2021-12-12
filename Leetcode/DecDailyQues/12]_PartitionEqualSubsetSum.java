package DecDailyQues;

class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        if(sum%2 != 0) return false;
        return subsetSum(nums, sum/2, nums.length);
    }
    private boolean subsetSum(int[] nums, int sum, int n){
        boolean[][] ar = new boolean[n+1][sum+1];
        
        ar[0][0] = true;
        for (int i = 1; i < n+1; i++) {
            ar[i][0] = true;
        }
        for (int j = 1; j < sum+1; j++) {
            ar[0][j] = false;
        }
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                ar[i][j] = ar[i-1][j];
                if (j >= nums[i-1]) {
                ar[i][j] = (ar[i][j] || ar[i-1][j-nums[i-1]]);
                }
            }
        }
        return ar[n][sum];
    }     
}
