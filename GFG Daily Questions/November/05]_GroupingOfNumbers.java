package November;

class GroupingOfNumbers {
    static int maxGroupSize(int[] arr, int N, int K) {
        // code here
        int[] rem = new int[K];
        for (int i=0; i < N; i++) {
            int remainder = arr[i] % K;
            rem[remainder]++;
        }
        
        int ans = 0;
        int left = 1, right = K - 1;
        while (left < right) {
            if (rem[left] >= rem[right]) {
                ans += rem[left];
            } else if (rem[left] < rem[right]) {
                ans += rem[right];
            }
            left++;
            right--;
        }
        
        if (left == right && rem[left] > 0) {
            ans++;
        }
        
        if (rem[0] > 0) {
            ans++;
        }
        
        return ans;
    }
}
