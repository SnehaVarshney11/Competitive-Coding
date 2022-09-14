package September;

import java.util.ArrayList;

class PowerOf2AndSubsequences {
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
        int count=0; 

        for(int i=0; i<N; i++){

            if( ( A.get(i) & (A.get(i)-1) )== 0){count++;}

        }

        int mod= 1000000007;

        return (long)(Math.pow(2, count)%mod -1 )%mod;
    }
}
