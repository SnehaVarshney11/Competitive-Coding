package Leetcode.AprilDailyQues;

import java.util.Collections;
import java.util.PriorityQueue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         for(int st: stones)
             pq.offer(st);
     
         while(pq.size() > 1) {
             int f = pq.poll();
             int s = pq.poll();
             if(f != s) 
                 pq.offer(f-s);
         }
     
         return pq.isEmpty() ? 0 : pq.peek(); 
     }
}
