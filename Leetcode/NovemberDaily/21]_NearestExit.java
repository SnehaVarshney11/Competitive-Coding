package Leetcode.NovemberDaily;

import java.util.LinkedList;
import java.util.Queue;

class NearestExit {
    public int nearestExit(char[][] maze, int[] ent) {
        
        // dir array to go in all 4 directions
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        int xVal = ent[0];
        int yVal = ent[1];
        
        int n = maze.length;
        int m = maze[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        // visted array to restrict control to go to already visited node
        boolean vis[][] = new boolean[n][m];
        
        q.add(ent);
        // mark the visited value as true as soon as we add it into the bfs queue.
        vis[xVal][yVal] = true;
        int steps = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            steps++;
            for(int i=0;i<size;i++)
            {
                int[] node = q.poll();
                for(int k=0;k<dir.length;k++)
                {
                    int x = node[0]+dir[k][0];
                    int y = node[1]+dir[k][1];
                    // check for all conditions
                    if(x>=0 && x<n && y >=0 && y<m && vis[x][y] == false && maze[x][y] == '.')
                    {
                        q.add(new int[]{x,y});
                        vis[x][y] = true;
                        
                        // if the control is on the boundary just return.
                        if(x == 0 || y == 0 || x ==n-1 || y== m-1)
                            return steps;
                    }
                }
            }
        
        }
        
       return -1;
    }
}
