package GFG Daily Questions.May;

class PartyInTown {
    public static boolean[] visited;
    static int partyHouse(int N, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        int res = Integer.MAX_VALUE;
        
        for(int i = 1; i <= N; i++){
            visited = new boolean[N+1];
            res = Math.min(res, dfs(adj, i));
        }
        return res;
    }
    private static int dfs(ArrayList<ArrayList<Integer>> al, int s){
        visited[s] = true;
        int tmp = 0;
        for(int adj : al.get(s)){
            if(!visited[adj]){
                tmp = Math.max(tmp, 1+dfs(al, adj));
            }
        }
        return tmp;
    }
}
