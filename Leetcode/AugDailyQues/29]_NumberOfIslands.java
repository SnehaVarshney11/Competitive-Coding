package Leetcode.AugDailyQues;

class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0; //count the total no of island
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){ // if we find one in matrix
                    count++;
                    BFS(grid, i, j); 
                }
            }
        }
        return count;
    }
        
    public void BFS(char[][] grid, int i, int j){
        //Base Condition
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        BFS(grid, i+1, j); // up
        BFS(grid, i-1, j); // down
        BFS(grid, i, j-1); // left
        BFS(grid, i, j+1); // right
    }
}
