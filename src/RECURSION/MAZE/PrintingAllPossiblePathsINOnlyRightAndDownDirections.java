package RECURSION.MAZE;

public class PrintingAllPossiblePathsINOnlyRightAndDownDirections {
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        String answer = "";

        printPaths(answer, row, column);

    }

    static void printPaths(String answer, int row, int column){

        if (row == 1 && column == 1){
            System.out.println(answer);
            return;
        }

        if (row > 1)
            printPaths(answer + 'D', row - 1, column); // going down

        if (column > 1 )
            printPaths(answer + 'R', row, column - 1); // going right

    }
}
