package DecDailyQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(edges.length == 0) {
            List<Integer> leaves = new ArrayList<Integer>();
            leaves.add(0);
            return leaves;
        }
        
        /* Create Adjacency List */
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int[] edge: edges) {
            HashSet<Integer> list0 = map.getOrDefault(edge[0], new HashSet<Integer>());
            HashSet<Integer> list1 = map.getOrDefault(edge[1], new HashSet<Integer>());
            list0.add(edge[1]);
            map.put(edge[0], list0);
            list1.add(edge[0]);
            map.put(edge[1], list1);
        }
        
        /* Create first set of leaves */
        List<Integer> leaves = new ArrayList<Integer>();
        for(int node: map.keySet()) {
            if(map.get(node).size() == 1)
                leaves.add(node);
        }
        
        /* Recursively create new leaves and return last set of leaves */
        while(true) {
            List<Integer> newleaves = new ArrayList<Integer>();
            for(int leaf: leaves) {
                int neighbor = -1;
                for(int x: map.get(leaf))
                    neighbor = x;
                if(neighbor == -1)
                    continue;
                map.get(neighbor).remove(leaf);
                if(map.get(neighbor).size() == 1)
                    newleaves.add(neighbor);
            }
            
            if(newleaves.size() == 0)
                return leaves;
            leaves = newleaves;
        } 
    }    
}
