package Leetcode.AugDailyQues;

import java.util.Arrays;
import java.util.HashMap;

class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] A) {
        Arrays.sort(A);
        long ans = 0;
        HashMap<Integer, Long> fmap = new HashMap<>();
        for (int num : A) {
            long ways = 1;
            double lim = Math.sqrt(num);
            for (int j = 0, fA = A[0]; fA <= lim; fA = A[++j]) {
                if (num % fA != 0) continue;
                int fB = num / fA;
                if (fmap.containsKey(fB))
                    ways = (ways + fmap.get(fA) * fmap.get(fB) * (fA == fB ? 1 : 2)) % 1000000007;
            }
            fmap.put(num, ways);
            ans = (ans + ways) % 1000000007;
        }
        return (int)ans;
    }
}
