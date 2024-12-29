package RECURSION.MAZE;


import java.util.ArrayList;

public class IncludingPrintDiagonals {
    public static void main(String[] args) {

        ArrayList<String> ans = diagonals("", 3,3);
        System.out.println(ans);
    }


    // D -> Diagonal
    // V -> Vertical
    // H -> Horizontal

    static ArrayList<String> diagonals(String answer, int row, int column){

        if (row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(answer);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && column > 1)
            list.addAll(diagonals(answer + "D", row - 1, column -1));

        if (row > 1)
            list.addAll(diagonals(answer + "V", row - 1, column));

        if (column > 1)
            list.addAll(diagonals(answer + "H", row, column -1));

        return list;

    }
}
