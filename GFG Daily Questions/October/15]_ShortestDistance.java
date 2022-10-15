package October;

import java.util.ArrayList;

class ShortestDistance {
    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        int row = grid.length;

        int col = grid[0].length;   
        ArrayList<int[]> arrlist = new ArrayList<>(row * col);  
        
        int step = 0;   
        boolean[][] visited = new boolean[row][col];    
        for(int i=0; i<row; i++){   
            for(int j=0; j<col; j++){   
                if(grid[i][j] == 0){    
                    visited[i][j] = true;   
                }   
            }   
        }   
        
        arrlist.add(source);    
        while(arrlist.size() > 0){  
            int size = arrlist.size();  
            for(int k = 0; k<size; k++){    
                int[] curr = arrlist.get(0);    
                int currow = curr[0];   
                int currcolumn = curr[1];   
                arrlist.remove(0);  
                if(currow == destination[0] && currcolumn == destination[1]){   
                    return step;    
                }   
                if(currow-1>=0 && !visited[currow-1][currcolumn]){  
                    arrlist.add(new int[]{currow-1, currcolumn});   
                    visited[currow-1][currcolumn] = true;   
                }   
                    
                if(currow+1 < row && !visited[currow+1][currcolumn]){   
                    arrlist.add(new int[]{currow+1, currcolumn});   
                    visited[currow+1][currcolumn] = true;   
                }   
                    
                if(currcolumn-1 >= 0 && !visited[currow][currcolumn-1]){    
                    arrlist.add(new int[]{currow, currcolumn-1});   
                    visited[currow][currcolumn-1] = true;   
                }   
                    
                if(currcolumn+1 < col && !visited[currow][currcolumn+1]){   
                    arrlist.add(new int[]{currow, currcolumn+1});   
                    visited[currow][currcolumn+1] = true;   
                }   
            }   
            step++; 
        }   
        return -1;
    }
}
