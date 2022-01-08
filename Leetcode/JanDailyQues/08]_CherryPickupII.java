package JanDailyQues;

class CherryPickupII {
    public int cherryPickup(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		Integer[][][] dp = new Integer[m][n][n];
		return dfs(grid,m,n,0,0,n-1,dp);
	}

	public int dfs(int[][] grid,int m,int n,int r,int c1,int c2,Integer[][][] dp){
		if(r==m)
			return 0;
		if (dp[r][c1][c2]!=null)
			return dp[r][c1][c2];

		int res = 0;
		for(int p=c1-1;p<=c1+1;p+=1){
			for(int q=c2-1;q<=c2+1;q+=1){
				if(p>=0 && p<n && q>=0 && q<n){
					res = Math.max(res, dfs(grid,m,n,r+1,p,q,dp));
				}
			}
		}

		int ch = c1==c2 ? grid[r][c1] : grid[r][c1]+grid[r][c2];

		dp[r][c1][c2] = ch+res;
		return dp[r][c1][c2];
	}
}
