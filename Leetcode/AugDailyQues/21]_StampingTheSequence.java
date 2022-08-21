package Leetcode.AugDailyQues;

import java.util.ArrayList;
import java.util.List;

class StampingTheSequence {
    public int[] movesToStamp(String stamp, String target) {
        char[] s=stamp.toCharArray();
        char[] t=target.toCharArray();
        int count=0;
        boolean[] visited=new boolean[t.length];
        List<Integer> res=new ArrayList<>();
        while(count!=t.length){
            boolean didchange=false;
            for(int i=0;i<=t.length-s.length;i++){
                if(!visited[i] && canReplace(t,i,s)){
                    count=replace(t,i,s.length,count);
                    visited[i]=true;
                    didchange=true;
                    res.add(i);
                    if(count==t.length){
                        break;
                    }
                }
            }
            if(!didchange){
                return new int[0];
            }
        }
         int[] result=new int[res.size()];
        int k=0;
         for(int i=res.size()-1;i>=0;i--){
             result[k++]=res.get(i);
         }
     return result;
    }
    boolean canReplace(char[] t,int pos,char[] s){
        for(int i=0;i<s.length;i++){
            if(t[i+pos]!='?' && t[i+pos]!=s[i]){
                return false;
            }
        }
        return true;
    }
    int replace(char[] t,int pos, int len,int count){
        for(int i=0;i<len;i++){
            if(t[i+pos]!='?'){
                t[i+pos]='?';
                count++;
            }
        }
        return count;
    }
}
