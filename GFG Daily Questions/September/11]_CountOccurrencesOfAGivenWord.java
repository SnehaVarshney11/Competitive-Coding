package September;

class CountOccurrencesOfAGivenWord {
    public int[][] dir = {{0,-1},{-1,0},{0,1},{1,0}};
    public int count;
    public int findOccurrence(char mat[][], String target)
    {
        // Write your code here
        count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == target.charAt(0)){
                    mat[i][j] = '$';
                    dfs(mat, i, j, target, 0);
                    mat[i][j] = target.charAt(0);
                }
            }
        }
        return count;
    }
    public void dfs(char[][] mat, int i, int j, String target, int idx){
        if(idx == target.length()-1){
            count++;
            return;
        }
        for(int[] d : dir){
            int r = d[0]+i;
            int c = d[1]+j;
            if(r >= 0 && c >= 0 && r < mat.length && c < mat[0].length && mat[r][c] == target.charAt(idx+1)){
                mat[r][c] = '$';
                dfs(mat, r, c, target, idx+1);
                mat[r][c] = target.charAt(idx+1);
            }
        }
    }
}
