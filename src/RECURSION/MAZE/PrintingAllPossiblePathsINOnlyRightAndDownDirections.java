package RECURSION.MAZE;

import java.util.ArrayList;

public class PrintingAllPossiblePathsINOnlyRightAndDownDirections {
    public static void main(String[] args) {
        int row = 3;
        int column = 3;
        String answer = "";

//        printPaths(answer, row, column);

        System.out.println(path("", 3,3));

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



    // added to arraylist
    static ArrayList<String> path(String answer, int row, int column){
        if (row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(answer);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1){
            list.addAll(path(answer + 'D', row - 1, column));
        }

        if (column > 1){
            list.addAll(path(answer + 'R', row, column - 1));
        }


        return list;
    }
}
