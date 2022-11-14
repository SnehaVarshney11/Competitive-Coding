package Leetcode.NovemberDaily;

import java.util.HashSet;
import java.util.Set;

class MostStones {
    public int removeStones(int[][] stones) {
        int count=0;
        Set<int[]> visited=new HashSet<>();
        for(int i=0;i<stones.length;i++){
           if(!visited.contains(stones[i])){
                visited.add(stones[i]);
                removeStonesUtil(visited,stones,i);
                count++;
           }         
        }
        return stones.length-count;
    }
    public void removeStonesUtil(Set<int[]> visited,int stones[][],int idx){
        visited.add(stones[idx]);
        for(int i=0;i<stones.length;i++){
           if(!visited.contains(stones[i])){
               if(stones[idx][0]==stones[i][0] || stones[idx][1]==stones[i][1])             {
                   removeStonesUtil(visited,stones,i);
               }   
           }         
        }
    }
}
