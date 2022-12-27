package Leetcode.DecDaily;

import java.util.Arrays;

class MaximumBags {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int[] diff = new int[n];
        
        for (int i = 0; i < n; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        
        Arrays.sort(diff);
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (diff[i] == 0) {
                i++;
                count++;
            }
            if (additionalRocks >= diff[i]) {
                additionalRocks -= diff[i];
                count++;
            }
            else if (additionalRocks == 0 || additionalRocks < diff[i]) break;
        }
        
        return count;
    }
}
