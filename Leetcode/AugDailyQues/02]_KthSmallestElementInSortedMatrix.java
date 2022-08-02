package Leetcode.AugDailyQues;

import java.util.Arrays;

class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] ar = new int[n*n];
        int index = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ar[index++] = matrix[i][j];
            }
        }
        
        Arrays.sort(ar);
        
        return ar[k-1];
    }
}
