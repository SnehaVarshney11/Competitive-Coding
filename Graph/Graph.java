package Graph;

import java.util.HashMap;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        for(int i = 1; i <= v; i++){
            map.put(i, new HashMap<>());
        }
    }
    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost); //2k->4:2,2:3
        map.get(v2).put(v1, cost);
    }
    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }
    public int noOfEdge(){
        int sum = 0;
        for(int key: map.keySet()){
            sum += map.get(key).size();
        }
        return sum/2;
    }
    public void removeVertex(int v){
        //find key ka neighbour wala map and delete the vertex
        for(int key: map.get(v).keySet()){
            map.get(key).remove(v);
        }
        map.remove(v);
    }
    //print map corresponding key
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
    public static void main(String[] args){
        Graph g = new Graph(7);
        g.addEdge(1,4,5);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
    }
}
