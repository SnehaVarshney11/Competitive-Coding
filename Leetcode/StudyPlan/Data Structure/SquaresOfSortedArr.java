public class SquaresOfSortedArr {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] res = new int[nums.length];
            int i = 0, j = n-1;
            
            for(int k = n-1; k >= 0; k--){
                if(Math.abs(nums[i]) > nums[j]){
                    res[k] = nums[i] * nums[i];
                    i++;
                }
                else{
                    res[k] = nums[j] * nums[j];
                    j--;
                }
            }
            return res;
        }
    }
}
