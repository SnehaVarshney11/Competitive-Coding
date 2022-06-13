package June;

class Solution {
    int isRepeat(String s) 
    {
        String repeat = getSubstring(s);
        if(repeat.equals(" "))
        return 0;
        int n = repeat.length();
        for(int i=0;i<s.length();i+=n)
            if(!repeat.equals(s.substring(i,i+n))) return 0;
        return 1;
    }
    
    String getSubstring(String str)
    {
        int k=1;
        int n = str.length();
        String res = " ";
        while(k <= n/2)
        {
           if(n%k == 0)
           {
               String pre = str.substring(0,k);
               String suf = str.substring(n-k,n);
               if(pre.equals(suf))
               res = pre;
           }
           k++;
        }
        return res;
    }
}