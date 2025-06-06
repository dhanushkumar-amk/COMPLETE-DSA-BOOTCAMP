package RECURSION.BACKTRACKING;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static void queens(boolean[][] board, int row){

        if (row == board.length){
            display(board);
            System.out.println();
            return;
        }

//        int count = 0;

        // placing the queen and checking for every row and column
        for (int column = 0; column < board.length; column++) {
            // place the queen if it is safe

            if (isSafe(board, row, column)){
                board[row][column] = true;
                queens(board, row + 1);
                board[row][column] = false;
            }
        }
//        return count;

    }

    private static boolean isSafe(boolean[][] board, int row, int column) {
        // check vertical row
        for (int i = 0; i < row ; i++) {
            if (board[i][column]) // its true means already has  queen
                return false;
        }

        // diagonal left

        int maxLeft = Math.min(row, column);
        for (int i = 1; i <= maxLeft ; i++) {
            if (board[row - i][column - i])
                return false;
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - column - 1);
        for (int i = 1; i <= maxRight ; i++) {
            if (board[row - i][column + i])
                return false;
        }
        return true;


    }

    private static void display(boolean[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
