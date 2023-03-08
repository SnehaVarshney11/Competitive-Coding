package StudyPlan.Algorithm;

import java.util.LinkedList;
import java.util.Queue;

class Matrix {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0)
                    q.add(new int[]{i,j});
                else
                    mat[i][j] = -1;
            }
        }
        
int[][] dirs = {{0,1}, {-1,0}, {1,0}, {0,-1}};
        int len = 0;
        while(!q.isEmpty()){
            int size = q.size();
            len++;
            while(size-->0){
                int[] cell = q.poll();
                for(int[] dir:dirs){
                    int r = cell[0] + dir[0];
                    int c = cell[1] + dir[1];
                    if(r<0 || c<0 || r==mat.length || c==mat[0].length || mat[r][c] != -1)
                        continue;
                    mat[r][c] = len;
                    q.add(new int[]{r,c});
                }
            }
        }
        return mat;
    }    
}
