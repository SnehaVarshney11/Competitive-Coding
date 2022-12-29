package Leetcode.DecDaily;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class STCPU {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] sorted = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            sorted[i][0] = tasks[i][0];
            sorted[i][1] = tasks[i][1];
            sorted[i][2] = i;
        }
        
        Arrays.sort(sorted, (a, b) -> a[0] - b[0]);
        
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] != b[1] ? a[1] - b[1] : a[2] - b[2]);
        
        long time = 0;
        int res[] = new int[n];
        int i = 0, index = 0;;
        
        while (index < n || !pq.isEmpty()) {
            if (pq.isEmpty() && time < sorted[index][0]) 
                time = sorted[index][0];
    
            while (index < n && time >= sorted[index][0]) { 
                pq.add(sorted[index]);
                index++;
            }
            
            time += pq.peek()[1]; 
            res[i++] = pq.peek()[2];
            pq.remove();
	    }
	
	    return res;
    }
}
