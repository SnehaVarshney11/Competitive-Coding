class SquareRootOfANumber {
    //By using sqrt function
    long floorSqrt(long x)
	 {
		// Your code here
		long sqr = (long) Math.sqrt(x);
		long res = (long)(sqr);
		return res;
	 }
     //Without using sqrt function
     public static int floorSqrt(int x)
    {
        // Base Cases
        if (x == 0 || x == 1)
            return x;
        // Do Binary Search for floor(sqrt(x))
        long start = 1, end = x, ans=0;
        while (start <= end)
        {
            long mid = (start + end) / 2;
 
            // If x is a perfect square
            if (mid*mid == x)
                return (int)mid;
 
            // Since we need floor, we update answer when mid*mid is
            // smaller than x, and move closer to sqrt(x)
            if (mid*mid < x)
            {
                start = mid + 1;
                ans = mid;
            }
            else   // If mid*mid is greater than x
                end = mid-1;
        }
        return (int)ans;
    }
}
