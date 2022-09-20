package September;

class MaximumNumberOfSquares {
    public static long numberOfSquares(long base)
    {
        //code here
        long n = base/2;
        return (n*(n-1))/2;
    }
}
