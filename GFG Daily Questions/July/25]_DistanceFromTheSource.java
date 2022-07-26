package July;

import java.util.ArrayList;
import java.util.Arrays;

class DistanceFromTheSource {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {
        // Write your code here
        int distance[] = new int[V];
        Arrays.fill( distance, 100000000);
        distance[S] = 0;
        for(int i=0; i<V-1; i++){
            for(ArrayList<Integer> pair : adj){
                int p = pair.get(0);
                int q = pair.get(1);
                int cost = pair.get(2);
                if(distance[p] + cost < distance[q]){
                    distance[q] = distance[p] + cost;
                }
                
            }
        }
        return distance;
        
    }
}
