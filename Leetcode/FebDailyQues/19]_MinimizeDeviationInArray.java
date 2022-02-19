package FebDailyQues;

import java.util.TreeSet;

class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int ar : nums){
            if(ar % 2 == 1){
                treeSet.add(ar * 2);
            }else{
                treeSet.add(ar);
            }
        }
        int min_diff = Integer.MAX_VALUE;
        while(true){
            int minVal = treeSet.first();
            int maxVal = treeSet.last();
            int cur_diff = maxVal - minVal;
            min_diff = Math.min(min_diff, cur_diff);
            if(maxVal % 2 == 0){
                treeSet.remove(maxVal);
                treeSet.add(maxVal / 2);
            }else{
                return min_diff;
            }
        }
    }
}
