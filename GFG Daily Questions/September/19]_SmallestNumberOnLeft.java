package September;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SmallestNumberOnLeft {
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>();

        Stack<Integer> st = new Stack<>();  
        st.push(a[0]);  
        list.add(-1);   
        for(int i=1;i<n;i++){
            while(st.size()>0 && a[i]<=st.peek()){  
                st.pop();   
            }   
            if(st.size()==0){    
                list.add(-1);   
                st.push(a[i]);  
            }   
            else{  
                list.add(st.peek());    
                st.push(a[i]);  
            }           
        }   
        return list;
    }
}
