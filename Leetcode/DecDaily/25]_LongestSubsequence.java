package Leetcode.DecDaily;

import java.util.Arrays;

class LongestSubsequence {
    public int[] answerQueries(int[] nums, int[] queries) {

        int n = nums.length;

        int m = queries.length;

        int[] answer = new int[m];

        Arrays.sort(nums);

        int sum = Arrays.stream(nums).sum();

        for (int i = 0; i < m; i++) {

            int j = n-1;

            int curSum = sum;

            while (j >= 0 && curSum > queries[i]) {

                curSum -= nums[j];

                j--;

            }

            answer[i] = j + 1;

        }

        return answer;

        

    }
}
