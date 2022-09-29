package Leetcode.SepDailyQues;

import java.util.ArrayList;
import java.util.List;

class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        int low = 0;
        int high = arr.length - 1;
        
        while(high-low >= k){
            int lowDis = Math.abs(arr[low] - x);
            int highDis = Math.abs(arr[high] - x);
            
            if(lowDis <= highDis)
                high--;
            else
                low++;
        }
        while(low <= high)
            list.add(arr[low++]);
        return list;
    }
}
