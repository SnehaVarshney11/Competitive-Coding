package Leetcode.AugDailyQues;

import java.util.HashMap;
import java.util.PriorityQueue;

class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<Integer,PriorityQueue<Integer>>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                map.putIfAbsent(i-j,new PriorityQueue<Integer>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        
        int[][] ans=new int[mat.length][mat[0].length];
        
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j]=map.get(i-j).poll();
            }
        }
        
        return ans;
    }
}
