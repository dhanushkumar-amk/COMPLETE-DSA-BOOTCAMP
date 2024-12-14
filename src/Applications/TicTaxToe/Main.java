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
            

        }
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






}
