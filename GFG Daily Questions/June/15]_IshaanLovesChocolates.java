package June;

class IshaanLovesChocolates {
    public static int chocolates (int arr[], int n) {
        //Complete the function
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
