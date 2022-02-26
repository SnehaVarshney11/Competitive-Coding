package FebDailyQues;

import java.util.LinkedList;
import java.util.Queue;

class ShortestPathVisitingAllNodes {
    public int shortestPathLength(int[][] graph) {
        int len = graph.length;
 		boolean[][] visited = new boolean[len][1 << len];
 		int expect = (1 << len) - 1;
 		Queue<int[]> q = new LinkedList<>();
 		for(int i = 0; i < len; i++){
 			q.offer(new int[]{i, 1 << i});
 		}
 		int step = -1;
 		while(!q.isEmpty()){
 			step++;
 			int size = q.size();
 			for(int sz = 0; sz < size; sz++){
 				int[] cur = q.poll();
 				int node = cur[0];
 				int state = cur[1];
 				if(state == expect) return step;
 				if(visited[node][state]) continue;
 				visited[node][state] = true;
 				for(int next: graph[node]){                    
 					q.offer(new int[]{next, state | (1 <<next)});
 				}
 			}
 		}
 		return step;
    }
}
