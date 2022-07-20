package Leetcode.JulyDailyQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class NumberOfMatchingSubsequences{
    HashMap<Character,List<Integer>> map = new HashMap<>();

    boolean isSubSequence(String str){
        int req=-1;
        for(char x:str.toCharArray()){
            boolean should=false;
            if(!map.containsKey(x)){return false;}
            for(int i:map.get(x)){
                if(i>req){req=i;should=true;break;}
            }
            if(!should){return false;}
        }
        return true;
    }


    public int numMatchingSubseq(String s, String[] words) {
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),new ArrayList<Integer>());
            }
            map.get(s.charAt(i)).add(i);
        }
        int res=0;
        for(String str:words){
            if(isSubSequence(str)){res++;}
        }
     
        return res;
    }
}