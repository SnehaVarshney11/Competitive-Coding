import java.util.HashMap;
import java.util.Map;

class LongestSubarrayWithSumDivisibleByK{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
       Map<Integer, Integer> map = new HashMap<>();
       int len = 0, sum = 0;
       map.put(0, -1);
       for(int i = 0; i < n; i++){
           sum = (sum % k + a[i] % k + k);
           int x = sum % k;
           if(map.containsKey(x)){
               len = Math.max(len, i-map.get(x));
           }else{
               map.put(x, i);
           }
       }
       return len;
    }
}