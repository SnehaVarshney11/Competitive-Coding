package Love_Babbar_Cheat_Sheet.Array;

class MinimizeTheHeightsII {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(arr == null || n <= 0) return -1;
        Arrays.sort(arr);
        int min = 0, max = 0, ans = 0;
        ans = arr[n-1] - arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] >= k){
                max = Math.max(arr[i-1]+k, arr[n-1]-k);
                min = Math.min(arr[i]-k, arr[0]+k);
                ans = Math.min(ans, max-min);
            }else{
                continue;
            }
        }
        return ans;
    }
}
