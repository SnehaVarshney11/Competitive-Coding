package September;

import java.util.Arrays;

class MinimumTimeToFulfilAllOrders {
    public static int findMinTime(int n, int l, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int s = arr[0];
        int e = arr[arr.length-1] * n * (n+1) / 2;
        
        int time = 0;
        while(s <= e) {
            int mid = (s+e)/2;
            
            if(isPossible(arr, mid, n)) {
                time = mid;
                e = mid-1;
            } else {
                s = mid+1;
            }
        }
        
        return time;
    }
    
    public static boolean isPossible(int[] arr, int mid, int n) {
        int donuts = 0;
        
        for(int i=0;i<arr.length;i++) {
            int timeWeHave = mid;
            int timeWillTake = arr[i];
            while(timeWeHave >= timeWillTake) {
                timeWeHave -= timeWillTake;
                timeWillTake += arr[i];
                donuts++;
            }
        }
        
        return donuts >= n ? true : false;
    }
}
