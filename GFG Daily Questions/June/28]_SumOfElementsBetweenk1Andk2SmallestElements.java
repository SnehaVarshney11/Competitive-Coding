package June;

import java.util.Arrays;

class SumOfElementsBetweenk1Andk2SmallestElements {
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes here
        Arrays.sort(A);
        long sum = 0;
        for(long i = K1; i < K2-1; i++){
            sum += A[(int)i];
        }
        return sum;
    }
}
