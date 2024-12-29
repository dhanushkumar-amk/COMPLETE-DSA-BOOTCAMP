package RECURSION.MAZE;

public class CountPossiblePathsOnlyRightAndDownDirections {
    public static void main(String[] args) {

        int row = 3;
        int column = 3;
        System.out.println( countPath(row, column));
    }
    static  int countPath(int row, int column){

        if (row == 1 || column == 1)
            return 1;

        int right = countPath(row, column - 1);
        int down = countPath(row - 1, column);

        return down + right;

    }
}
