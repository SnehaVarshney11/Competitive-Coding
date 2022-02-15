class BinaryArraySorting {
    static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int j = -1;
        for (int i = 0; i < n; i++) {
 
            // if number is smaller than 1
            // then swap it with j-th number
            if (arr[i] < 1) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
	} 
}
