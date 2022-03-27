package MarchDailyQues;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class TheKWeakestRowsInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        Queue<int[]> queue = new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i=0;i<mat.length;i++){
            int[] r = mat[i];
            queue.offer(new int[]{Arrays.stream(r).sum(),i});
        }
        for(int i=0;i<k;i++) ans[i] = queue.poll()[1];
        return ans;
    }
}
