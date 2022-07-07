package Leetcode.JulyDailyQues;

import java.util.HashMap;

class InterleavingString {
    HashMap<String, Boolean> map;
    public boolean isInterleave(String s1, String s2, String s3) {
        map = new HashMap<>();
        return find(s1, s2, s3, s1.length()-1, s2.length()-1, s3.length()-1);
    }
    
    boolean find(String a, String b, String c, int i, int j, int k){
        
        
        if( i == -1 && j == -1 && k == -1)  return true;
        String key = i+"-"+j+"-"+k;
        
        if( map.containsKey(key))   return map.get(key);
         
        if( i >= 0 && j >= 0 && k >= 0 && a.charAt(i) == b.charAt(j) && b.charAt(j) == c.charAt(k) ){
            boolean temp = find(a, b, c, i-1, j, k-1) || find(a, b, c, i, j-1, k-1);
            map.put(key, temp);
            return temp;
            
        }
        
        
        if( i >= 0 && k >= 0 && a.charAt(i) == c.charAt(k) ){
            boolean temp = find(a, b, c, i-1, j, k-1);
            map.put(key, temp);
            return temp;
        }
        
        if( j >= 0 && k >= 0 && b.charAt(j) == c.charAt(k) ){
            boolean temp = find(a, b, c, i, j-1, k-1);
            map.put(key, temp);
            return temp;
        }
        
        return false;
       
    }
}
