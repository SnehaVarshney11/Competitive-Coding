package MarchDailyQues;

import java.util.Stack;

class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        
        for(int val: pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek() == popped[i]){
                st.pop();
                i++;
            }
        }
        return st.isEmpty();
    }
}
