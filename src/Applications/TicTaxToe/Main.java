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
        


    }
}
