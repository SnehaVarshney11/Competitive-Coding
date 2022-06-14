package June;

class SmallestFactorialNumber {
    int findNum(int n)
        {
            int low = 0;
            int high = n * 5;
            int ans = high;
            while(low <= high){
                int mid = low + (high - low)/2;
                int x = 5;
                int total = 0;
                while(x <= mid){
                    total += mid/x;
                    x *= 5;
                }

                if(total < n){
                    low = mid + 1;
                }
                else if(total > n){
                    high = mid - 1;
                    ans = Math.min(ans, mid);
                }
                else{
                    ans = mid;
                    break;
                }
            }
            ans -= ans % 5;
            return ans;
        }
}
