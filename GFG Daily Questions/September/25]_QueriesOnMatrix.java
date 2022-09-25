package September;

class QueriesOnMatrix {
    public int[][] solveQueries(int n, int[][] Q) {
        // Code here
        int[][] res=new int[n][n];

        for(int i=0;i<Q.length;i++){    
            
            int l1=Q[i][0]; 
            int l2=Q[i][1]; 
            int r1=Q[i][2]; 
            int r2=Q[i][3]; 
                
            for(int j=l1;j<=r1;j++){    
                for(int k=l2;k<=r2;k++){    
                    res[j][k]++;;   
                }   
            }   
        }   
        return res;
    }
}
