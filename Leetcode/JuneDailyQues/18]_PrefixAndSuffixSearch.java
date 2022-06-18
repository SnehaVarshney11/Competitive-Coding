package Leetcode.JuneDailyQues;

import java.util.HashMap;

class PrefixAndSuffixSearch{
    HashMap<String, Integer> map = new HashMap<>();
    public PrefixAndSuffixSearch(String[] words) {
        for(int i=0;i<words.length;i++){
            search(words[i],i);
        }
    }
    
    public int f(String prefix, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        sb.append('#');
        sb.append(suffix);
        return map.getOrDefault(sb.toString(),-1);
    }
    public void search(String w,int idx){
        
         for (int i = 0; i < w.length (); i++) {
                String s = w.substring (0, i + 1);
                for (int j = w.length () - 1; j >= 0; j--) {
                    StringBuilder str = new StringBuilder ();
                    str.append (s);
                    str.append ("#");
                    str.append (w.substring (j));
                    map.put(str.toString (), idx);
                }
        }
    }
}