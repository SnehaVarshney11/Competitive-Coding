package CompanyWiseQuestions.Amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class KLargestEleInArray {
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
       Integer[] obj_array = Arrays.stream( arr ).boxed().toArray( Integer[] :: new);
        Arrays.sort(obj_array, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);
  
        for (int i = 0; i < k; i++)
            list.add(obj_array[i]);
      
        return list;
    }
}
