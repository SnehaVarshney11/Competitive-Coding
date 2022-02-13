package FebDailyQues;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ip = new ArrayList<>(); // ip = input
        for(int i = 0; i < nums.length; i++){
            ip.add(nums[i]);
        }
        List<Integer> op = new ArrayList<>(); // op = output
        List<List<Integer>> res = new ArrayList<>(); 
        
        solve(ip, op, res);
        return res;
    }
    public void solve(List<Integer> ip, List<Integer> op, List<List<Integer>> res){
        if(ip.size() == 0){
            res.add(op);
            return;
        }
        
        List<Integer> op1 = new ArrayList<>(op); // op1 = output1
        List<Integer> op2 = new ArrayList<>(op); // op2 = output2
        
        op2.add(ip.get(0));
        
        //NEED TO DECALARE NEW input ARRAYLIST BECUASE JAVA IS "PASS BY VALUE"
        List<Integer> input = new ArrayList<>(ip);

        input.remove(0);
        
        solve(input, op1, res);
        solve(input, op2, res);
    }
}
