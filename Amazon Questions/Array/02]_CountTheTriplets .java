import java.util.Arrays;

class CountTheTriplets  {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int i = n-1; i >= 0; i--){
            int j = 0, k = i-1;
            while(j < k){
                if(arr[i] == arr[j] + arr[k]){
                    count++;
                    j++;
                    k--;
                }else if(arr[i] > arr[j] + arr[k]){
                    j += 1;
                }else{
                    k -= 1;
                }
            }
        }
        return count;
    }
}
