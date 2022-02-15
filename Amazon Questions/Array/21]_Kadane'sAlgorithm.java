class KadaneAlgorithm {
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max_so_far = arr[0];
        long curr_max = arr[0];
        
        for(int i = 1; i < n; i++){
            curr_max = Math.max(arr[i] , curr_max + arr[i]);
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }
}