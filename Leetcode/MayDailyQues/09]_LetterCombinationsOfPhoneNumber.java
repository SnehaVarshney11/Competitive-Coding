package Leetcode.MayDailyQues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        
        map.put("2", "abc");map.put("3", "def");map.put("4", "ghi");
        map.put("5", "jkl");map.put("6", "mno");map.put("7", "pqrs");
        map.put("8", "tuv");map.put("9", "wxyz");
        
        Deque<String> dq = new ArrayDeque<>();
        dq.add("");
        for(int i = 0; i < digits.length(); i++){ // 2 3 4
            String d = digits.substring(i, i + 1); // 2
            String fromMap = map.get(d); // abc
            int n = dq.size();
            for(int j = 0; j < n; j++){
                String pull = dq.pollFirst(); // [] [a][b][c]
                for(int k = 0; k < fromMap.length(); k++){
                    String x = pull.concat(fromMap.charAt(k) + ""); // "" + a
                    dq.add(x);
                }
            }
        }
        
        while(!dq.isEmpty()){
            res.add(dq.poll());
        }
        return res;
    }
}
