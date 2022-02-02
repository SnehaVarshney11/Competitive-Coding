class WaveArray {
    public static void convertToWave(int arr[], int n){
        
        // Your code here
        int tmp = 0;
        for(int i = 0; i < n-1; i+=2){
            tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
        }
    }
}
