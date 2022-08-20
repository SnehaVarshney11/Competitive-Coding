package Leetcode.AugDailyQues;

import java.util.PriorityQueue;

class MinimumNumberOfRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int max_reach=startFuel;
        
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b) -> b[1]-a[1]);
        int count=0;
        int index=0;
        
        while(max_reach<target){
            while(index<stations.length && stations[index][0]<=max_reach){
                pq.add(stations[index]);
                index++;
            }
            
            if(pq.isEmpty())  
                return -1;
            
            max_reach +=pq.remove()[1]; 
            count++;
            
        }
        return count;
    }
}
