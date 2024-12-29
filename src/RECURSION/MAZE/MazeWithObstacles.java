package RECURSION.MAZE;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        path("", maze, 0, 0);
    }

    static  void path(String answer, boolean[][] maze, int row, int column){

        if (row  == maze.length - 1 && column == maze[0].length -1){
            System.out.println(answer);
            return;
        }
        
        if (maze[row][column] == false)
            return;

        if (row < maze.length - 1)
            path(answer + "D", maze, row + 1, column);

        if (column < maze[0].length - 1)
            path(answer + "R", maze, row, column + 1);

    }

}
