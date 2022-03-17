package MarchDailyQues;
import java.util.Stack;

class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(count);
                count = 0;
            }else{
                count = st.pop() + Math.max(2 * count, 1);
            }
        }
        return count;
    }
}
