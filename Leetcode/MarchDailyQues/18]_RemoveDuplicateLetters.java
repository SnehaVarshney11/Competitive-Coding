package MarchDailyQues;

import java.util.HashMap;
import java.util.Stack;

class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] alpha = new int[26];
        HashMap<Character, Integer> map =  new HashMap<>();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) map.put(s.charAt(i), i);
        
		//TRAVERSE EACH CHARACTER
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
			
			//IF ALREADY ADDED, CONTINUE
            if(alpha[curr - 'a'] == 1) continue;
			
			//IF WE CAN POP THE PEEK BECAUSE IN NEXT TRAVERSAL I CAN ADD THIS CHARACTER 
			//BY USING IT'S LAST INDEX.
            while(!stack.isEmpty() && curr < stack.peek() && i < map.get(stack.peek())){
			// ONCE I POP I HAVE TO CHANGE THE ALPHA ARRAY TOO.
                alpha[stack.pop() - 'a'] = 0;
            }
            stack.push(curr);
            alpha[curr - 'a'] = 1;
        }
        
        StringBuilder sb = new StringBuilder();   
        while(!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
