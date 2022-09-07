package September;

import java.util.ArrayList;
import java.util.Stack;

class StackPermutations {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> stack=new Stack<>();
       ArrayList<Integer> res=new ArrayList<>();
       int k=0,x=0;
       for(int i=0;i<n;i++)
       {
           if(ip[i]==op[k])
           {
               res.add(ip[i]);
               k++;
               while(!stack.isEmpty())
               {
                   if(stack.peek()==op[k])
                   {
                       res.add(stack.pop());
                       k++;
                   }
                   else{
                       break;
                   }
               }
           }
           else{
               stack.push(ip[i]);
               }
           
       }
       
       if(res.size()!=op.length)
       {
           return 0;
       }
       
       for(int i:res)
       {
           if(i!=op[x])
           {
               return 0;
           }
           x++;
       }
       return 1;
    }
}
