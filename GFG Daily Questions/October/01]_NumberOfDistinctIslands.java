package October;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class NumberOfDistinctIslands {
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        
        Set<String> paths = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ArrayList<Character> path = new ArrayList<>();
                explore(grid, visited, i, j, n, m, path);
                char[] ch = new char[path.size()];
                for (int k = 0; k < path.size(); k++) ch[k] = path.get(k);
                if (path.size() > 0) paths.add(new String(ch));
            }
        }
        
        return paths.size();
    }
    
    public static void explore(int[][] grid, boolean[][] visited, int i, int j, int n, int m, ArrayList<Character> path) {
        if (i < 0 || j < 0 || i >= n || j >= m) return;
        if (visited[i][j]) return;
        if (grid[i][j] == 0) return;
        
        visited[i][j] = true;
        
        path.add('D');
        explore(grid, visited, i+1, j, n, m, path);
        
        path.add('R');
        explore(grid, visited, i, j+1, n, m, path);
        
        path.add('U');
        explore(grid, visited, i-1, j, n, m, path);
        
        path.add('L');
        explore(grid, visited, i, j-1, n, m, path);
        
        path.add('B');
    }
}
