package Leetcode.DecDaily;

class PossibleBipartition {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[][] g = new int[N][N];
        for (int[] d : dislikes) {
            g[d[0] - 1][d[1] - 1] = 1;
            g[d[1] - 1][d[0] - 1] = 1;
        }
        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            if (group[i] == 0 && !dfs(g, group, i, 1)) {
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int[][] g, int[] group, int index, int gr) {
        group[index] = gr;
        for (int i = 0; i < g.length; i++) {
            if (g[index][i] == 1) {
                if (group[i] == gr) {
                    return false;
                }
                if (group[i] == 0 && !dfs(g, group, i, -gr)) {
                    return false;
                }
            }
        }
        return true;
    }
}
