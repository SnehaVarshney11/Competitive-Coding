package AprilDailyQues;

import java.util.HashMap;
import java.util.Map;

class threeSumWithMultiplicity {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, mod = 1000000007;
        
        for(int i = 0; i < arr.length; i++){
            ans = (ans + map.getOrDefault(target - arr[i], 0)) % mod;
            
            for(int j = 0; j < i; j++){
                int tmp = arr[i] + arr[j];
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
        }
        return ans;
    }
}
