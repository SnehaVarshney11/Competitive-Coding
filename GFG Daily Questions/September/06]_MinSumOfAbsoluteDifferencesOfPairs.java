package September;

import java.util.Arrays;

class MinSumOfAbsoluteDifferencesOfPairs {
    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long sum=0;
        for(int i=0;i<N;i++){
           sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
}
