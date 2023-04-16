package Leetcode.AprilDailyQues;

import java.util.Deque;
import java.util.LinkedList;

class BaseballGame {
    public int calPoints(String[] ops) {
        Deque<Integer> dq = new LinkedList<>();
        for(String str: ops){
            if("+".equals(str)){
                int op1 = dq.pop();
                int op2 = op1 + dq.peek();
                dq.push(op1);
                dq.push(op2);
            }else if("C".equals(str)){
                dq.pop();
            }else if("D".equals(str)){
                dq.push(2*dq.peek());
            }else{
                dq.push(Integer.parseInt(str));
            }
        }
        int ans = 0;
        while(!dq.isEmpty()){
            ans += dq.pop();
        }
        return ans;
    }
}
