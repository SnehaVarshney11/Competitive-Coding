package August;

import java.util.ArrayList;
import java.util.Arrays;

class CountingElementsInTwoArrays {
    static int binarySearch(int arr[],int value)
    {
        int l = 0, r = arr.length-1;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] <= value)   l = mid+1;
            else r = mid-1;
        }
        return l;
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();
  
        for(int i=0;i<m;i++) list.add(binarySearch(arr2,arr1[i]));
        return list;
    }
}
