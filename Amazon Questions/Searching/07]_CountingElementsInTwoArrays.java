import java.util.ArrayList;
import java.util.Arrays;

class CountingElementsInTwoArrays {
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> al = new ArrayList<Integer>();
       Arrays.sort(arr2);
       int count = 0;
       for(int i = 0; i < m; i++){
           count = 0;
           for(int j = 0; j < n; j++){
               if(arr1[i] >= arr2[j]){
                   count++;
               }else{
                   break;
               }
           }
           al.add(count);
       }
       return al;
    }
}
