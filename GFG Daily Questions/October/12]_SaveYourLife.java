package October;

import java.util.HashMap;

class SaveYourLife {
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        HashMap<Character,Integer> uwu=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            uwu.put(x[i],b[i]);
        }
        
        StringBuilder temp=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        
        
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(char c:w.toCharArray())
        {
            curr+=uwu.containsKey(c)?uwu.get(c):c;
            temp.append(c);
            
            
            if(curr>max)
            {
                  max=curr;
                  ans=new StringBuilder(temp);
            }
          
            
            
            if(curr<0)
            {
                curr=0;
                temp=new StringBuilder();
            }
        }
        
        return ans.toString();
    }
}
