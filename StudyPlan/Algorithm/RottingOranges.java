package StudyPlan.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int count_fresh = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] != 0){
                    count_fresh++;
                }
            }
        }
        if(count_fresh == 0)
            return 0;
        int count_min = 0, count = 0;
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        
        //bfs starting from initially rotten oranges
        while(!q.isEmpty()){
            int size = q.size();
            count += size;
            for(int i = 0; i < size; i++){
                int[] point = q.poll();
                for(int j = 0; j < 4; j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    
                    if(x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;
                    q.offer(new int[]{x,y});
                }
            }
            if(q.size()!=0)
                count_min++;
        }
        return count_fresh == count ? count_min : -1;
    }
}
