class MaxSumInTheConfiguration {
    int max_sum(int A[], int n)
    {
	// Your code here
	int sum = 0;
	int s0 = 0;
	for(int i = 0; i < A.length; i++){
	    sum += A[i];
	    s0 += A[i] * i;
	}
	int max = s0;
	int si = s0;
	for(int i = 0; i < A.length-1; i++){
	    int siplusone = si + sum - n*A[n-i-1];
	    if(siplusone > max){
	        max = siplusone;
	    }
	    si = siplusone;
	}
	return max;
    }
}
