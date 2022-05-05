package Leetcode.MayDailyQues;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    Queue<Integer> q1 ;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(q1.size() == 0) return 0;
        else{
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            int val = q1.remove();
            while(q2.size() > 0){
                q1.add(q2.remove());
            }
            return val;
        }
    }
    
    public int top() {
        if(q1.size() == 0) return 0;
        else{
            while(q1.size()>1){
                q2.add(q1.remove());
            }
            int val = q1.remove();
            q2.add(val);
            while(q2.size()>0){
                q1.add(q2.remove());
            }
            return val;
        }
    }
    
    public boolean empty() {
        if(q1.size() == 0){
            return true;
        }
        return false;
    }
}
