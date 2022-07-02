package July;

class CountThePaths {
    public int DFS(int [][]adj,int r,int c,int d)
    {
        if(c == d)
        return 1;
        
        int count = 0;
        for(int i=0;i<adj.length;i++)
            if(adj[c][i] == 1)
                count += DFS(adj,c,i,d);
        return count;
    }
    
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        if(s == d)
        return 1;
        
        //Create Graph Using Matrix
        int adj[][] = new int[n][n];
        for(int i=0;i<edges.length;i++)
            adj[edges[i][0]][edges[i][1]] = 1;
        
        return DFS(adj,0,s,d);
    }
}
