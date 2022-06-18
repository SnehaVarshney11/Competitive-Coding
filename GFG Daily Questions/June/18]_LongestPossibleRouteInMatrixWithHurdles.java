package June;

class LongestPossibleRouteInMatrixWithHurdles {
    int ans=-1;
    public int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
       // code here
       req(xs,ys,xd,yd,n,m,0,mat);
       return ans;
    }
    int req(int i,int j,int k,int l,int n,int m,int len,int[][]mat){
       if(i<0 || j<0 || i==n || j==m || mat[i][j]==0){ return 0; }
       if(i==k && j==l ){ ans=Math.max(ans,len); return 0; }
       mat[i][j]=0;
       req(i+1,j,k,l,n,m,len+1,mat);
       req(i,j+1,k,l,n,m,len+1,mat);
       req(i-1,j,k,l,n,m,len+1,mat);
       req(i,j-1,k,l,n,m,len+1,mat);
       mat[i][j]=1;
       return 0;
    }
}
