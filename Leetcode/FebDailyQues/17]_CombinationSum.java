package FebDailyQues;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombo(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    private void findCombo(int index, int[] ar, int target, List<List<Integer>> ans, List<Integer> ds){
        if(index == ar.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(ar[index] <= target){
            ds.add(ar[index]);
            findCombo(index, ar, target - ar[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombo(index + 1, ar, target, ans, ds);
    }
}
