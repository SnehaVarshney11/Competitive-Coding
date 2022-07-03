package July;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class WordBreak {
    static void mString(Set<String> setD,Queue<Character> q,List<String> res,String result)
    {
        if(q.isEmpty()) res.add(result.substring(1));
        String str = "";
        while(!q.isEmpty())
        {
            str += Character.toString(q.remove());
            if(setD.contains(str))
            {
                Queue<Character> qTemp = new LinkedList<>(q);
                mString(setD,qTemp,res,result+" "+str);
            }
        }
    }
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        Set<String> setD = new HashSet<>(dict);
        Queue<Character> q = new LinkedList<>();
        List<String> res = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            q.add(s.charAt(i));
        }
        mString(setD,q,res,"");
        return res;
    }
}
