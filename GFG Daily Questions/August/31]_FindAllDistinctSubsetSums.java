package August;

class FindAllDistinctSubsetSums{
    public int[] DistinctSum(int[] nums)
    {
        // Code here
        int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
       }
       int ans[] = new int[sum+1];
       ans[0]=1;
       int[][] dp = new int[nums.length+1][sum+1];
       for(int i=0;i<=nums.length;i++){
           dp[i][0]=1;
       }
       for(int i=1;i<=nums.length;i++){
           for(int j=1;j<=sum;j++){
               if(nums[i-1]<=j){
                   if(dp[i-1][j]==1) dp[i][j]=1;
                   else dp[i][j]=dp[i-1][j-nums[i-1]];
               }else{
                   if(dp[i-1][j]==1) dp[i][j]=1;
                   else dp[i][j]=0;
               }
               
               if(dp[i][j]==1){
                   if(ans[j]==0) ans[j]=1;
               }
           }
       }
       int c=0;
       for(int i=0;i<=sum;i++){
           if(ans[i]==1) c++;
       }
       int arr[] = new int[c];
       int j=0;
       for(int i=0;i<=sum;i++){
           if(ans[i]==1){
               arr[j]=i;
               j++;
           }
       }
       return arr;
    }
}