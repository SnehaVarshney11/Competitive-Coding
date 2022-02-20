package FebDailyQues;

import java.util.Arrays;

class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));
        int count = 0, cur = 0;
        for(int interval[] : intervals){
            if(cur < interval[1]){
                cur = interval[1];
                count++;
            }
        }
        return count;
    }
}
