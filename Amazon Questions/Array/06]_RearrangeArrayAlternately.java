class RearrangeArrayAlternately {
    public static void rearrange(int arr[], int n){
        
        // Your code here
        int[] temp = arr.clone();
        int small = 0, large = n-1;
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(flag){
                arr[i] = temp[large];
                large--;
            }else{
                arr[i] = temp[small];
                small++;
            }
            flag = !flag;
        }
    }
}
