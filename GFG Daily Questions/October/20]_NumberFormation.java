package October;

class NumberFormation {
    public int getSum(int X, int Y, int Z) {
        // Your code goes here
        if(X==0&&Y==0&&Z==0){

            return 0;

        }

        long[][][] num=new long[X+1][Y+1][Z+1];

        long[][][] sum=new long[X+1][Y+1][Z+1];

        long ans=0;

        int mod=1000000007;

        num[0][0][0]=1;

        for(int i=0;i<=X;i++){

            for(int j=0;j<=Y;j++){

                for(int k=0;k<=Z;k++){

                    if(i>0){

                        sum[i][j][k]+=(sum[i-1][j][k]*10+4*num[i-1][j][k])%mod;

                        num[i][j][k]+=num[i-1][j][k]%mod;

                    }

                    if(j>0){

                        sum[i][j][k]+=(sum[i][j-1][k]*10+5*num[i][j-1][k])%mod;

                        num[i][j][k]+=num[i][j-1][k]%mod;

                    }

                    if(k>0){

                        sum[i][j][k]+=(sum[i][j][k-1]*10+6*num[i][j][k-1])%mod;

                        num[i][j][k]+=num[i][j][k-1]%mod;

                    }

                    ans+=sum[i][j][k]%mod;

                    ans=ans%mod;

                }

            }

        }

        return (int)ans;
    }
}
