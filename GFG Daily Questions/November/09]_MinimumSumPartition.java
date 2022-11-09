package November;

import java.util.Arrays;

class MinimumSumPartition {
    int actualsum;
    int dp(int index,int sum,int arr[],int dp[][]){
        if(actualsum==sum) return sum;
        else if(index>=arr.length){
            return Math.abs(sum-(actualsum-sum));
        }
        if(dp[index][sum]!=-1) return dp[index][sum];
        int min=dp(index+1,sum+arr[index],arr,dp);
        min=Math.min(dp(index+1,sum,arr,dp),min);
        return dp[index][sum]=min;
    }
	public int minDifference(int arr[], int n) 
	{ 
	    for(int i:arr) actualsum+=i;
	    int [][]dp=new int[n][actualsum];
	    for(int i[]:dp) Arrays.fill(i,-1);
	    return dp(0,0,arr,dp);
	} 
}
