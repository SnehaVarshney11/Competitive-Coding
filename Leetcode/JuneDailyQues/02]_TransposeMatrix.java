package Leetcode.JuneDailyQues;

class TransposeMatrix{
    public int[][] transpose(int[][] matrix) {
        int[][] transpose_matrix = new int[matrix[0].length][matrix.length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transpose_matrix[j][i] = matrix[i][j];
            }
        }
        return transpose_matrix;
    }
}