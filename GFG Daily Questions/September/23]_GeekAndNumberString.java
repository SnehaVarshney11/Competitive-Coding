package September;

import java.util.HashSet;
import java.util.Stack;

class GeekAndNumberString {
    public int minLength(String s, int n) { 
    	// code here 
    	HashSet<String> hs = new HashSet<>();
        String[] arr = new String[]{"12", "21", "34", "43", "56", "65", "78", "87", "09", "90"};
        for(String str : arr)   hs.add(str);
    	
    	Stack<Character> st = new Stack<>();
    	for(int i=0;i<s.length();i++){
    	    if(!st.isEmpty() && (hs.contains(s.charAt(i)+st.peek()+"") || hs.contains(""+st.peek()+s.charAt(i)))){
    	        st.pop();
    	    }else{
    	        st.push(s.charAt(i));
    	    }
    	}
    	
    	return st.size();
    }
}
