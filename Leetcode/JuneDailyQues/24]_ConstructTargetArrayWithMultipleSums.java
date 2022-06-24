package Leetcode.JuneDailyQues;

import java.util.PriorityQueue;

class ConstructTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max Heap
        long sum = 0;
        
        for(int num: target){
            sum += num;
            pq.offer(num);
        }
        
        while(pq.peek() != 1){
            int value = pq.poll(); // Max Value from Queue
            
            long diff = sum - value;
    
            if(diff == 1) 
                return true;
    
            if(diff > value || diff == 0 || value % diff == 0) 
                return false;
    
            value %= diff;
            sum = diff + value;
            
            pq.offer(value);
        }
        
        return true;
    }
}
