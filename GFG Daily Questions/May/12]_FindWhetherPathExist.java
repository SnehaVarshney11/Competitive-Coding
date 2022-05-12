class FindWhetherPathExist {
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j] == 1){
                   return Helper(grid, i, j);
               }
           }
       }
       return false;
    }
    public int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
   boolean Helper(int[][] grid, int r, int c){
       if(grid[r][c] == 2){
           return true;
       }
       grid[r][c] = 0;
       for(int i=0;i<dir.length;i++){
           int sr = r + dir[i][0];
           int sc = c + dir[i][1];
           
           if(sr >=0 && sc >= 1 && sr < grid.length && sc < grid[0].length && grid[sr][sc] != 0){
               boolean res = Helper(grid, sr, sc);
               if(res){
                   return true;
               }
           }
       }
       return false;
   }
}
