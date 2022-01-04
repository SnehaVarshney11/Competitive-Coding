package CompanyWiseQuestions.Amazon;

import java.util.Arrays;

class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        // square the element in array
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        for(int i = n-1; i >= 2; i--){
            int left = 0;
            int right = i-1;
            
            while(left < right){
                if(arr[left] + arr[right] == arr[i]){
                    return true;
                }
                if(arr[left] + arr[right] < arr[i]){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}
