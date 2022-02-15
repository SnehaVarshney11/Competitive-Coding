import java.util.ArrayList;
import java.util.Stack;

class SortedSubsequenceOfSize3 {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        ArrayList<Integer> al = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr.get(i)){
                st.pop();
            }
            st.push(arr.get(i));
            if(st.size() == 3){
                break;
            }
        }
        if(st.size() >= 3){
            for(int i = 2; i >= 0; i--){
                al.add(st.pop());
            }
        }
        return al;
    }
}
