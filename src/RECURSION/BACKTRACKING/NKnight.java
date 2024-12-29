package RECURSION.BACKTRACKING;




public class NKnight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0,0,4);
    }
    static void knights(boolean[][] board, int row, int column, int knight){

        if (knight == 0){
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length-1 && column == board[0].length)
            return;

        if (column == board.length) {
            knights(board, row + 1, 0, knight);
            return;
        }

        if (isSafe(board, row, column)){
            board[row][column] = true;
            knights(board, row , column + 1, knight - 1);
            board[row][column] = false;
        }

        knights(board, row , column + 1, knight);


    }

    private static boolean isSafe(boolean[][] board, int row, int column) {
        if (isValid(board,row, column)){
            if (board[row][column])
                return false;
        }

        if (isValid(board,row - 2, column + 1)){
            if (board[row - 2][column + 1])
                return false;
        }

        if (isValid(board,row - 2, column - 1)){
            if (board[row - 2][column - 1])
                return false;
        }

        if (isValid(board,row - 1, column + 2)){
            if (board[row - 1][column + 2])
                return false;
        }

        if (isValid(board,row - 1, column- 2)){
            if (board[row-1][column - 2])
                return false;
        }

        return true;


    }

    // check if the given value is out of bound or not
    static boolean isValid(boolean[][] board, int row, int column){
        if (row >= 0 && row < board.length && column >= 0 && column < board.length)
            return true;
        return false;
    }


    private static void display(boolean[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if (board[i][j]){
                    System.out.print("K ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
