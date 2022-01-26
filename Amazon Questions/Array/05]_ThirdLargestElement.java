class ThirdLargestElement {
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n < 3) return -1;
	    
	    int first = a[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
	    for(int i = 1; i < n; i++){
	        if(a[i] > first){
	            third = second;
	            second = first;
	            first = a[i];
	        }else if(a[i] > second){
	            third = second;
	            second = a[i];
	        }else if(a[i] > third){
	            third = a[i];
	        }
	    }
	    return third;
    }
}
