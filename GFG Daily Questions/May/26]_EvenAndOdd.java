package May;

class EvenAndOdd {
    static void reArrange(int[] arr, int N) {
        // code here
        if(N == 1) return;
        int even = 0, odd = 1;
        while(even < N && odd < N){
            if(arr[even] % 2 == 0){
                even += 2;
            }else if(arr[odd] % 2 == 1){
                odd += 2;
            }else{
                swap(arr, odd, even);
                even += 2;
                odd += 2;
            }
        }
    }
    static void swap (int[] ar, int odd, int even){
        int t = ar[odd];
        ar[odd] = ar[even];
        ar[even] = t;
    }
}
