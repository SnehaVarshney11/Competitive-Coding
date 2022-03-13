package MarchDailyQues;

import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        int l = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<l; i++){
            char d = s.charAt(i);
            if(st.empty()){
                st.push(d);
            }
            else if(st.peek()=='(' && d==')'){
                st.pop();
            }
            else if(st.peek()=='[' && d==']'){
                st.pop();
            }
            else if(st.peek()=='{' && d=='}'){
                st.pop();
            }
            else{
                st.push(d);
            }
        }
        return st.empty();
    }
}
