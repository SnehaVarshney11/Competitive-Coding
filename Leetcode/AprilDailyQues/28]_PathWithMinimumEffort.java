package Leetcode.AprilDailyQues;

class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        
        if(row == 1 && col == 1){
            return 0;
        }
        int[][] ar = new int[row][col];
        
        for(int[] r : ar){
            Arrays.fill(r, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((t1,t2) -> (t1[2]-t2[2]));
        pq.offer(new int[]{0,0,0});
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int cur_row = cur[0];
            int cur_col = cur[1];
            int cur_wt = cur[2];
            
            for(int x[] : dir){
                int nrow = cur_row + x[0];
                int ncol = cur_col + x[1];
                if(nrow < 0 || nrow >= row || ncol < 0 || ncol >= col){
                    continue;
                }
                int wt = Math.max(cur_wt, Math.abs(heights[nrow][ncol] - heights[cur_row][cur_col]));
                if(wt < ar[nrow][ncol]){
                    ar[nrow][ncol] = wt;
                    pq.offer(new int[]{nrow, ncol, wt});
                }
            }
        }
        return ar[row-1][col-1];
    }
}
