package October;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PrintLeafNodes {
    public int[] leafNodes(int arr[], int N)
    {
        // code here
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
            if(!st.isEmpty()&&st.peek()<arr[i]) {
                int add = st.pop();
                int count = 1;
                while(!st.isEmpty()&&st.peek()<arr[i]) {
                    count++;
                    st.pop();
                }
                if(count>=2)
                list.add(add);
            }
            st.add(arr[i]);
        }
        if(!st.isEmpty())
        list.add(st.pop());
        
        int ret[] = new int[list.size()];
        for(int i=0;i<list.size();i++)
        ret[i] = list.get(i);
        
        return ret;
    }
}
