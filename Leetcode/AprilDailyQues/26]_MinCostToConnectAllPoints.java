package Leetcode.AprilDailyQues;

class MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length, cost = 0;
        
        // Construct adjacency matrix
        int[][] adj = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                adj[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                adj[j][i] = adj[i][j];
            }
        }
        
        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> ((int[])a)[0] - ((int[])b)[0]);
        int curNode = 0;
        visited[curNode] = true;
        int[] temp;
        
        for (int i=0; i<n-1; i++) {
            // Insert unvisited adjacent nodes of curNode in min heap
            for (int j=0; j<n; j++) {
                if (!visited[j]) {
                    pq.offer(new int[] {adj[curNode][j], j});
                }
            }
            
            // Select minimum cost edge 
            do {
                temp = pq.poll();
                curNode = temp[1];
            } while (visited[curNode]);
            
            cost += temp[0];
            visited[curNode] = true;
        }
        return cost;
    }
}
