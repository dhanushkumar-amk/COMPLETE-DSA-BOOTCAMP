package RECURSION.BACKTRACKING;

import java.util.Arrays;

public class PrintMatrixAndPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };

        int[][] path = new int[maze.length][maze[0].length];

        path("", maze, 0,0,path, 1);

    }
    static  void path(String answer, boolean[][] maze, int row, int column, int[][] path , int steps){

        if (row == maze.length -1 && column == maze[0].length - 1){
           for(int[] arr : path){
               System.out.println(Arrays.toString(arr));
           }
            return;
        }

        if (!maze[row][column])
            return;

            // if not false make it as false  so next time we can't go

        maze[row][column] = false;
        path[row][column] = steps;  // add answer to path array




        // for down
        if (row < maze.length - 1)
            path(answer + "D", maze, row + 1, column, path, steps + 1);

        // for right
        if (column < maze[0].length - 1)
            path(answer + "R", maze, row, column + 1, path, steps + 1);

        // for up
        if (row > 0)
            path(answer + "U", maze, row - 1, column, path, steps + 1);

        // for left
        if (column > 0)
            path(answer + "L", maze, row, column - 1, path, steps + 1);


        // to return a function it make it as a true for future calls
        maze[row][column] = true;
        path[row][column] = 0;



    }
}
