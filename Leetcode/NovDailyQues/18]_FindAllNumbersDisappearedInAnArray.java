package NovDailyQues;

import java.util.ArrayList;
import java.util.List;

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] res = new int[nums.length + 1];
 
         for (int num : nums) {
             res[num] = num;
         }
     
         List<Integer> result = new ArrayList<>(res.length);
         
         for (int i = 1; i < res.length; i++) {
             if (res[i] == 0) {
                 result.add(i);
             }
         }
         return result;
     }    
}
