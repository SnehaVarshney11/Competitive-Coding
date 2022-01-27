class RotateArray {
    static void reverse(int[] arr, int s, int n){
        int tmp = 0;
        for(int i = s, j = n-1; i < j; i++, j--){
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        reverse(arr, 0, d);
        reverse(arr, d, n);
        reverse(arr, 0, n);
    }
}
