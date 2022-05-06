package Leetcode.MayDailyQues;

import java.util.Stack;

class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stack.size() > 0 && s.charAt(stack.peek()[0]) == s.charAt(i))
            {
                stack.peek()[1]++;
            }
            else
            {
                stack.push(new int[]{i,1});
            }
            
            if(stack.peek()[1]==k)
                stack.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0)
        {
            int top[] = stack.pop();
            while(top[1]-->0)
            {
                sb.append(s.charAt(top[0]));
            }
        }
        
        return sb.reverse().toString();
    }
}
