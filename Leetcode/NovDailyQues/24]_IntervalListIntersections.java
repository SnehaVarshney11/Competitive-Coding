package NovDailyQues;

import java.util.ArrayList;
import java.util.List;

class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length == 0)
            return firstList;
        if(secondList.length == 0)
            return secondList;
        int i = 0, j = 0;
        List<int[]> res = new ArrayList<>();
        
        while(i < firstList.length && j < secondList.length){
            int first_start = firstList[i][0];
            int first_end = firstList[i][1];
            int second_start = secondList[j][0];
            int second_end = secondList[j][1];
            
            if(first_start >= second_start && first_start <= second_end){
                res.add(new int[]{first_start, Math.min(first_end, second_end)});
            }
            else if(second_start >= first_start && second_start <= first_end){
                res.add(new int[]{second_start, Math.min(first_end, second_end)});
            }
            if(second_end > first_end) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][2]);
    }
}