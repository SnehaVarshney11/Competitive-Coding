package StudyPlan.Algorithm;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
    	// opt[i][j] is the path sum start from one node of bottom layer to node (i,j)
    	int[][] opt = new int[n+1][n+1];
    	for(int i = n-1;i>=0;i--){
    		for(int j=0;j<=i;j++){
    			opt[i][j] = Math.min(opt[i+1][j],opt[i+1][j+1]) + triangle.get(i).get(j);
    		}
    	}
    	return opt[0][0];
    }
}
