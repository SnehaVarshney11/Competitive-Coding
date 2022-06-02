package June;

class RatMazeWithMultipleJumps {
    public int[][] ShortestDistance(int[][] matrix)
    {
        int n = matrix.length;
     
        int[][] res = new int[n][n];
        
        if(ShortestDistance(matrix, res, 0, 0, n)) 
            return res;
        else return new int[][]{{-1}};
    }
    public boolean ShortestDistance(int [][]matrix,int [][]res,int i,int j,int n){
        if(i>=n||j>=n) return false;
        res[i][j]=1;
        if(i==n-1&&j==n-1) return true;
        
        int jump=matrix[i][j];
        for(int k=1;k<=jump;k++){
            if(ShortestDistance(matrix,res,i,j+k,n)) return true;
            if(ShortestDistance(matrix,res,i+k,j,n)) return true;
        }
        res[i][j]=0;
        return false;
    }
}
