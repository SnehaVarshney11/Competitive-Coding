package October;

import java.util.HashMap;
import java.util.Map;

class Substrings {
    static int countOfSubstrings(String S, int K) {
        // code here
        int ans=0;

        int n = S.length();

        Map<Character,Integer> set = new HashMap<>();

        for(int  i=0; i<K; i++)

        {

            set.put(S.charAt(i), set.getOrDefault(S.charAt(i),0)+1);

        }

        if(set.size()==K-1)

        ans++;

        

        for(int i=K; i<n; i++)

        {

            if(set.get(S.charAt(i-K))>0)

          {

               set.put(S.charAt(i-K), set.get(S.charAt(i-K))-1);

               if(set.get(S.charAt(i-K))==0)

               set.remove(S.charAt(i-K));

          }

          

            set.put(S.charAt(i), set.getOrDefault(S.charAt(i),0)+1);

            

          

            if(set.size()==K-1)

            ans++;

        }

        return ans;
    }
}
