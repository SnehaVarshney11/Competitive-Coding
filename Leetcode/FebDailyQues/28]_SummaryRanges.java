package FebDailyQues;

import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0)
            return list;
        
        int start = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == cur + 1) { // continue current range
                cur = nums[i];
            } else { // close current range and start a new one
                list.add(cur == start ? start + "" :start + "->" + cur);

                start = nums[i];
                cur = nums[i];
            }
        }
		// close the last range
        list.add(cur == start ? start + "" : start + "->" + cur);

        return list;
    }
}
