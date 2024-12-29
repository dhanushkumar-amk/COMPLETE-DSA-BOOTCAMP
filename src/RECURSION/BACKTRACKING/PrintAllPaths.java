package RECURSION.BACKTRACKING;

public class PrintAllPaths {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

       /*  boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };*/

        path("", maze, 0,0);
    }

    static void path(String answer, boolean[][] maze, int row, int column){

        if (row == maze.length -1 && column == maze[0].length - 1){
            System.out.println(answer);
            return;
        }

        if (!maze[row][column])
            return;

        // if not false make it as false  so next time we can't go
        else
           maze[row][column] = false;


        // for down
        if (row < maze.length - 1)
            path(answer + "D", maze, row + 1, column);

        // for right
        if (column < maze[0].length - 1)
            path(answer + "R", maze, row, column + 1);

        // for up
        if (row > 0)
            path(answer + "U", maze, row - 1, column);

        // for left
        if (column > 0)
            path(answer + "L", maze, row, column - 1);


        // to return a function it make it as a true for future calls
        maze[row][column] = true;

    }

}
