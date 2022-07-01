package Leetcode.JulyDailyQues;

import java.util.Arrays;

class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int count=0,i=0;
        while (i < boxTypes.length && truckSize > 0) {
			int max = Math.min(boxTypes[i][0], truckSize);
			count += max * boxTypes[i][1];
			truckSize -= max;
            i++;
		}
        return count;
    }
}
