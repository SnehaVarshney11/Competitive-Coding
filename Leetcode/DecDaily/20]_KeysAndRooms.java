package Leetcode.DecDaily;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        
        BFS(rooms,visited);
        
        for(int i=0; i<visited.length; i++){
            if(visited[i] == false) return false;
        }
        return true;
    }
    private void BFS(List<List<Integer>> rooms,boolean[] visited){
        Queue<Integer> queue =  new LinkedList<>();
        visited[0] = true;
        for(int i : rooms.get(0)){
            queue.add(i);
            visited[i] = true;
        }
        while(!queue.isEmpty()){
            int v = queue.poll();
            for(int i : rooms.get(v)){
                if(visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
