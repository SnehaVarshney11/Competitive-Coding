package Leetcode.MayDailyQues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PermutationsII{
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        boolean[] visited = new boolean[n];
        backtracking(nums, set, visited, new ArrayList<>());
        
        for(List<Integer> l : set){
            list.add(l);
        }
        return list;
    }
    private void backtracking(int[] nums, Set<List<Integer>> set, boolean[] visited, List<Integer> sublist){
        if(sublist.size() == nums.length){
            set.add(new ArrayList<>(sublist));
        }
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                sublist.add(nums[i]);
                visited[i] = true;
                backtracking(nums, set, visited, sublist);
                visited[i] = false;
                sublist.remove(sublist.size() - 1);
            }
        }
    }
}