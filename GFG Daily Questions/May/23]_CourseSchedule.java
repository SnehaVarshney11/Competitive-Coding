import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class CourseSchedule {
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        // add your code here
        int ar[] = new int[n];
        for(int i=0; i<m; i++)
        {
            ar[prerequisites.get(i).get(1)]++;
        }
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++)
        {
            int n1 = prerequisites.get(i).get(0);
            int n2 = prerequisites.get(i).get(1);
            
            adj.get(n1).add(n2);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        boolean visit[] = new boolean[n];
        
        for(int i=0; i<n; i++)
        {
            if(ar[i]==0)
            {
                q.add(i);
                visit[i] = true;
            }
        }
        
        int res[] = new int[n];
        int count = 0;
        while(q.isEmpty()==false)
        {
            int node = q.poll();
            res[count++] = node;
            visit[node] = true;
            
            for(int nei : adj.get(node))
            {
                if(visit[nei]==false)
                {
                    ar[nei]--;
                    
                    if(ar[nei]==0)
                    {
                        //If the ar is zero then we can add to the q.
                        visit[nei] = true;
                        q.add(nei);
                    }
                }
            }
            
        }
        //Check if every node is visit else return an empty array.
        for(int i=0; i<n; i++)
        {
            if(visit[i]==false) return new int[0];
        }
        
        //Reverse the reswer
        for(int i=0; i<n/2; i++)
        {
            int temp = res[i];
            res[i] = res[n-i-1];
            res[n-i-1] = temp;
        }
        return res;
    }
}
