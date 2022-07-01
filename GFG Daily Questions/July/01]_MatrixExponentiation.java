package July;

class MatrixExponentiation {
    private int mod = (int)1e9+7;
    
    private long[][] multiply(long a[][], long b[][]){
        long arr[][] = new long[2][2];
        arr[0][0] = (a[0][0]*b[0][0]+a[0][1]*b[1][0])%mod;
        arr[0][1] = (a[0][0]*b[0][1]+a[0][1]*b[1][1])%mod;
        arr[1][0] = (a[1][0]*b[0][0]+a[1][1]*b[1][0])%mod;
        arr[1][1] = (a[1][0]*b[0][1]+a[1][1]*b[1][1])%mod;
        return arr;
    }
    
    private long[][] power(long arr[][], int p){
        if(p==1) return arr;
        long temp[][] = power(arr,p/2);
        if(p%2==0) return multiply(temp,temp);
        return multiply(multiply(temp,temp),arr);
    }
    
    public int FindNthTerm(int n)
    {
        // code here
        long arr[][] = {{1,1},{1,0}};
        arr = power(arr,n);
        return (int)arr[0][0];
    }
}
