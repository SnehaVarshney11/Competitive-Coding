package June;

import java.util.PriorityQueue;

class HelpAThief {
    static int maxCoins(int[] A, int[] B, int T, int N) {
        // code here
        if(T==0) return 0;
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<N;i++){
            pq.add(new int []{A[i],B[i]});
        }
        int res=0;
        while(T>0&&!pq.isEmpty()){
            int []p=pq.poll();
            for(int i=0;i<p[0]&&T-->0;i++){
             res+=p[1];
           }
        }
        return res;
    }
}
