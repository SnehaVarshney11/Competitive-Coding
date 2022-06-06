package June;

import java.util.HashMap;
import java.util.Map;

class CountPairsInArrayDivisibleByK {
    public static long countKdivPairs(int arr[], int n, int k)
    {
        //code here
        Map<Integer, Integer> mp = new HashMap<>();
        long count = 0;
        for(int i : arr){
            int rem = i%k;
            if(mp.containsKey((rem == 0 ? 0 : (k-rem)))){
                count += (long)mp.get((rem == 0 ? 0 : (k-rem)));
            }
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
