import java.util.ArrayList;
import java.util.Collections;

class PermutationWithSpaces {
    void helper(ArrayList<String> al,String S,int n){
        if(n==1){
            al.add(S);
            return;
        }

        String s1=S;
        String s2=S.substring(0,n-1)+" "+S.substring(n-1);
        helper(al,s1,n-1);
        helper(al,s2,n-1);
        return; 
    }
   ArrayList<String> permutation(String S){
       // Code Here
       ArrayList<String> ans = new ArrayList<>();
       helper(ans,S,S.length());
       Collections.sort(ans);
       return ans;
   }
}
