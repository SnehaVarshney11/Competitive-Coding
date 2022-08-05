package Leetcode.AugDailyQues;

class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i = 0; i < target; i++){
            if(dp[0] == 0){
                continue;
            }
            for(int num : nums){
                if(num + i <= target)
                    dp[i+num] += dp[i];
            }
        }
        return dp[target];
    }
}
