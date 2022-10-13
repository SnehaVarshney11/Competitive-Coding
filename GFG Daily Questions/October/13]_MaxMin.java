package October;

import java.util.Arrays;

class MaxMin {
    public static int findSum(int A[],int N) 
    {
        //code here
        Arrays.sort(A);

        return (A[0]+A[N-1]);
    }
}
