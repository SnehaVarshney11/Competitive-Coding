package Leetcode.AprilDailyQues;

import java.util.ArrayList;
import java.util.List;

class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int total = row * col;
        k = k % total;
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < row; i++){
            List<Integer> sub_list = new ArrayList<>();
            for(int j = 0; j < col; j++){
                int index = findShiftedIndex(i, j, col, k, total);
                sub_list.add(grid[index / col][index % col]);
            }
            ans.add(sub_list);
        }
        return ans;
        
    }
    private int findShiftedIndex(int i, int j, int col, int k, int total){
        int index = (i * col + j + total - k) % total;
        return index;
    }
}
