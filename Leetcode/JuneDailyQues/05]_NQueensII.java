package Leetcode.JuneDailyQues;

class NQueensII {
    public int totalNQueens(int n) {
        boolean[][] mat = new boolean[n][n];

        return helper(mat, 0);
    }
    private static int helper(boolean[][] mat, int row) {
        // Base Condition.
        if (row >= mat.length) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < mat.length; col++) {
            if (isSafe(mat, row, col)) {
                mat[row][col] = true;
                count += helper(mat, row + 1);
                mat[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check Vertical.
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check Diagonal Left.
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal Right.
        int maxRight = Math.min(row, board[0].length - 1 - col);

        for (int i = 1; i <= maxRight ; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;

    }
}
