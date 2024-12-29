package RECURSION.BACKTRACKING;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };

        System.out.println(solve(board));

        if (solve(board)) {
            Display(board);
        } else {
            System.out.println("Can't be solved");
        }
    }


    static boolean isSafe(int[][] board, int row, int column, int num) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < board.length; i++) {
            int[] nums = board[i];
            if (nums[column] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = column - column % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void Display(int[][] board) {
    }

    private static boolean solve(int[][] board) {
    }

}
