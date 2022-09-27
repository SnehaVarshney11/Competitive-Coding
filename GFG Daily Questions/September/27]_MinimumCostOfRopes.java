package September;

import java.util.PriorityQueue;
import java.util.Queue;

class MinimumCostOfRopes {
    long minCost(long arr[], int n) 
    {
        // your code here
        Queue<Long> q =new PriorityQueue<>();
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        long sum=0;
        while(q.size()>=2){
            long a=q.poll();
            long b=q.poll();
            sum+=(a+b);
            q.add(a+b);
        }
        return sum;
    }
}
