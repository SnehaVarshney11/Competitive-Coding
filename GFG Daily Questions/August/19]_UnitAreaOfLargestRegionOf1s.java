package August;

class UnitAreaOfLargestRegionOf1s {
    int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
    public int findMaxArea(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(grid[i][j] == 1){
                    int[] count = {0};
                    dfs(grid, i, j, count);
                    ans = Math.max(ans, count[0]);
                }
            }
        }
        return ans;
    }
    private void dfs(int[][] grid, int x, int y, int[] count) {
        if(grid[x][y] == 0) return;
        int m = grid.length, n = grid[0].length;
        grid[x][y] = 0;
        count[0] += 1;
        for(int[] dir : dirs){
            int nx = x + dir[0];
            int ny = y + dir[1];
            if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 1){
                dfs(grid, nx, ny, count);
            }
        }
    }
}
