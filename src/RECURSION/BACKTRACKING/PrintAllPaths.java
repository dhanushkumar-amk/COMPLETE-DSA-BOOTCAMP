package RECURSION.BACKTRACKING;

public class PrintAllPaths {
    public static void main(String[] args) {

    }

    static void path(String answer, boolean[][] maze, int row, int column){

        if (row == maze.length -1 && column == maze[0].length - 1){
            System.out.println(answer);
            return;
        }

        if (!maze[row][column])
            return;

        // if not false make it as false  so next time we can'tgo
        else
           maze[row][column] = false;


        if (row < maze.length - 1)
            path(answer + "D", maze, row + 1, column);

        if (column < maze.length - 1)
            path(answer + "R", maze, row, column + 1);

        if (row >)



    }

}
