package DecDailyQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int diff = arr[i] - arr[i-1];
            if(diff == min){
                ans.add(Arrays.asList(arr[i-1], arr[i]));   
            }else if(diff < min){
                ans.clear();
                ans.add(Arrays.asList(arr[i-1], arr[i]));
                min = diff;
            }
        }
        return ans;
    }    
}
