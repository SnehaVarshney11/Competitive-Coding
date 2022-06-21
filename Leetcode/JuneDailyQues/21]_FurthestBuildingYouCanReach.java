package Leetcode.JuneDailyQues;

import java.util.PriorityQueue;

class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length-1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            int currJump = heights[i+1]-heights[i];
            
            if(currJump <= 0) continue;
            pq.add(currJump);
            
            if(ladders > 0){
                ladders--;
            }else{
                bricks -= pq.poll();
            }
            if(bricks<0){
                return i;
            }
        }
        return n;
    }
}
