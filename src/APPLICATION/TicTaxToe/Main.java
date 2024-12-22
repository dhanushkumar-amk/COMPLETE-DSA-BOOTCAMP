package Applications.TicTaxToe;

import java.util.*;

public class Main {


    // for overall class
    private static char[][] board;
    private static int n;
    private static char currentPlayer;

    public static void main(String[] args) {

        // get scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the grid (n * n): ");
        n = sc.nextInt();

        // create the board
        board = new char[n][n];
        initializeBoard();

        // init current player
        currentPlayer = 'X';

        // variable deceleration
        int moves = 0;
        boolean gameWon = false;

        // main games started
        while (moves < n * n && !gameWon){

            // print the board
            printBoard();

            // get the index to enter the value
            System.out.printf("Player %c, enter your move (row and column) : " , currentPlayer);
            int row = sc.nextInt();
            int column = sc.nextInt();

            // check if the user enter the move is valid or not
            if (isValid(row, column)){
                board[row][column] = currentPlayer;
                moves++;

                if (checkWin(row, column)){
                    gameWon = true;
                   printBoard();
                    System.out.printf("player %c wins ", currentPlayer);
                }
                else {
                    currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
                }
            }
            else
                System.out.println("Invalid move, Try again.");
        }

        // if the game is drawn after get out from the while loop then draw
        if (!gameWon){
            printBoard();
            System.out.println("The game is drawn");
        }

        sc.close();
    }

    // board initialize
    private static void initializeBoard(){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j] = '-';
            }
        }
    }

    // print board
    private static void printBoard(){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



    // check is user given value is valid or not
    private static boolean isValid(int row, int column){
        return row >= 0 && row < n && column >= 0 && column < n && board[row][column] == '-';
    }

    // check if the player is win or not
    private static boolean checkWin(int row, int column){
        return checkRow(row) || checkColumn(column) || checkDiagonals();
    }

    // wins check 1 row
    private static boolean checkRow(int row){
        for (int column = 0; column < n; column++) {
            if (board[row][column] != currentPlayer)
                return false;
        }
        return true;
    }

    // wins check 2 column
    private static boolean checkColumn(int column){
        for (int row = 0; row < n; row++) {
            if (board[row][column] != currentPlayer)
                return false;
        }
        return true;
    }

    // wins check 3 diagonals
    private static boolean checkDiagonals(){
        boolean diagonal1 = true;
        boolean diagonal2 = true;

        // diagonal 1
        for (int i = 0; i <n ; i++) {
            if (board[i][i] != currentPlayer)
                diagonal1 = false;

            if (board[i][n - i - 1] != currentPlayer)
                diagonal2 = false;
        }
        return diagonal1 || diagonal2;
    }

}
