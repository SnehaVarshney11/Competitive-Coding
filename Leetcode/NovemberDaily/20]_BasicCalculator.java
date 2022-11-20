package Leetcode.NovemberDaily;

import java.util.Stack;

class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        int num = 0;
        int sign = 1;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = 10 * num + (int)(c-'0');
            } else if(c == '+'){
                res = res + sign * num;
                num = 0;
                sign = 1;
            } else if(c == '-'){
                res = res + sign * num;
                num = 0;
                sign = -1;
            } else if(c == '('){
                st.push(res);
                st.push(sign);
                sign = 1;
                res = 0;
            } else if(c == ')'){
                res = res + sign * num;  
                num = 0;
                res *= st.pop();    
                res += st.pop(); 
            }
        }
        if(num != 0){
            res = res + sign * num;
        }
        return res;
    }
}
