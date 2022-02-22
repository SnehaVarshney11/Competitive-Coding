import java.util.Arrays;

class SmallestPositiveMissingNum {
    static int findMissing(int arr[], int size)
    {
       
       // Your code here
       int smallPos = 1;
       Arrays.sort(arr);
       for(int i = 0; i < size; i++){
           if(arr[i] == smallPos){
               smallPos++;
           }
       }
       return smallPos;
    }
}
