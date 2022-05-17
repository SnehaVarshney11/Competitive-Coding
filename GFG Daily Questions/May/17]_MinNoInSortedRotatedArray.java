class MinNoInSortedRotatedArray {
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
        int min = arr[low];
        while(low <= high){
            if(arr[low] < min){
                min = arr[low];
            }
            low++;
        }
        return min;
    }
}
