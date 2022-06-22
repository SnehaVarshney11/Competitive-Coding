package June;

import java.util.HashMap;

class Solution
{
    public int fun(String s)
    {
        // Write your code here
        HashMap <Character, Integer> mp = new HashMap <>();
       
        mp.put('a',0);
        mp.put('b',0);
        mp.put('c',0);
        for(int i = s.length()-1;i >= 0;i--)
        {
            if(s.charAt(i) == 'c')
                mp.put('c', (2*mp.get('c')+1) % 1000000007 );
            else if(s.charAt(i) == 'b')
                mp.put('b', ( (2*mp.get('b'))% 1000000007 + mp.get('c') ) % 1000000007 );
            else if(s.charAt(i) == 'a')
                mp.put('a', ( (2*mp.get('a'))% 1000000007 + mp.get('b') ) % 1000000007 );
        }
              
        return mp.get('a');
    }
}