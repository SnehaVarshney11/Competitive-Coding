package June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BipartiteGraph {
    public boolean helper(int node, ArrayList<ArrayList<Integer>>adj, int[] colors) {
         
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        colors[node] = 0;
        
        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            for (Integer neighbor : adj.get(curr)) {
                if (colors[neighbor] == -1) {
                    colors[neighbor] = 1 - colors[curr];
                    queue.offer(neighbor);
                    
                } else if (colors[curr] == colors[neighbor]) {
                    return false;
                }
                
            }
        }
        
        return true;
        
    }
    
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj) {
        int[] colors = new int[V];
        Arrays.fill(colors, -1);
       
        for (int i=0; i < V; i++) {
            if (colors[i] == -1) {
                if (!helper(i, adj, colors)) {
                    return false;
                }
            }
        }
       
        return true;
    }
}
