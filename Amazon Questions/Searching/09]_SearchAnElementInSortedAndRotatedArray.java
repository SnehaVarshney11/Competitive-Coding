class SearchAnElementInSortedAndRotatedArray {
    static int Search(int array[], int target)
	{
	    // code here
	    for(int i = 0; i < array.length; i++){
	        if(array[i] == target){
	            return i;
	        }
	    }
	    return -1;
	}
}
