package JanDailyQues;

import java.util.Arrays;

class MinNumOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (x, y) -> Integer.compare(x[1], y[1]));
        int res = 0, arrow = 0;
        
        for(int i = 0; i < points.length; i++){
            if(res == 0 || points[i][0] > arrow){
                res++;
                arrow = points[i][1];
            }
        }
        return res;
    }
}
