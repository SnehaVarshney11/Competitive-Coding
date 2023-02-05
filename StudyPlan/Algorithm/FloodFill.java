package StudyPlan.Algorithm;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        
        if(color != newColor){
            dfs(image, sr, sc, newColor, color);
        }
        return image;
    }
    
    public void dfs(int[][] image, int sr, int sc, int newColor, int color){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color)
            return;
           
        image[sr][sc] = newColor;
        dfs(image, sr + 1, sc, newColor, color);
        dfs(image, sr - 1, sc, newColor, color);
        dfs(image, sr, sc + 1, newColor, color);
        dfs(image, sr, sc - 1, newColor, color);
    }
}
