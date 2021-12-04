package Love_Babbar_Cheat_Sheet.Array;

class LargestSumContiguousSubarray {
    public static void main(String[] args){
        int[] ar = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous subarray is: " + maxSubarray(ar));
    }    
    static int maxSubarray(int ar[]){
        int size = ar.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i = 0; i < size; i++){
            max_end_here = max_end_here + ar[i];
            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
            }
            if(max_end_here < 0){
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
}
