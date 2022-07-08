package July;

class Pair
{
    String str;
    int cost;
    Pair(String str, int cost)
    {
        this.str = str;
        this.cost = cost;
    }
}
class BracketsInMatrixChainMultiplication {
    static Pair rec(int i, int j, int arr[], Pair dp[][])
    {
        if(i==j) return new Pair("" + (char)(i+64), 0);
        
        
        if(dp[i][j]!=null) return dp[i][j];
        
        int min_steps = Integer.MAX_VALUE;
        
        String output = "";
        for(int k = i; k<j; k++)
        {
            int steps = arr[i-1]*arr[k]*arr[j];
            Pair pl = rec(i, k, arr, dp);
            Pair pr = rec(k+1, j, arr, dp);
            steps += pl.cost + pr.cost;
            
            if(min_steps>steps)
            {
                min_steps = steps;
                output = "(" + pl.str + pr.str + ")";
                
            }
            
        }
        return dp[i][j] = new Pair(output, min_steps);
    }
    
    
    static String matrixChainOrder(int p[], int n){
        Pair dp[][] = new Pair[n][n];
        
        return rec(1, n-1, p, dp).str;
        
    }
}
