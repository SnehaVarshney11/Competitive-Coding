package Leetcode.MayDailyQues;

import java.util.ArrayList;
import java.util.List;

class CombinationSumIII {
    List<List<Integer>> allComb = new ArrayList<>();                     
    List<Integer> comb = new ArrayList<>();                              
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        findComb(k, n, 1);                                              
        return allComb;
    }
    
    private void findComb(int k, int n, int start) {                      
        if(k == 0 && n == 0){                                             
            allComb.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i < 10; i++){
            comb.add(i);
            findComb(k - 1, n - i, i + 1);
            comb.remove(comb.size() - 1);
        }
    }
}
