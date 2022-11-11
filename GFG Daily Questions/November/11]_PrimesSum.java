package November;

import java.util.ArrayList;
import java.util.List;

class PrimesSum {
    static String isSumOfTwo(int N){
        // code here
        List<Integer> al = sieve(N);
        
        int i = 0, j = al.size() - 1;
        
        while(i <= j){
            
            //System.out.println(al.get(i) + " " + al.get(j) + ", ");
            if(al.get(i) + al.get(j) == N)
                return "Yes";
        
            else if((al.get(i) + al.get(j)) < N){
                i++;
            }
            else{
                j--;
            }
        }
        
        return "No";
    }
    private static List<Integer> sieve(int n)
    {
        
        List<Integer> al = new ArrayList<>();
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                al.add(i);
        }
        return al;
    }
}
