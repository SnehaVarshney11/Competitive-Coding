package Leetcode.DecDaily;

import java.util.Stack;

class RPV {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String token : tokens){
            if("+-*/".contains(token)){
                int y = s.pop();
                int x = s.pop();
                if(token.equals("+")){
                    s.push(x+y);
                } else if(token.equals("-")){
                    s.push(x-y);
                }
                else if(token.equals("*")){
                    s.push(x*y);
                }
                else if(token.equals("/")){
                    s.push(x/y);
                }
            } else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}
