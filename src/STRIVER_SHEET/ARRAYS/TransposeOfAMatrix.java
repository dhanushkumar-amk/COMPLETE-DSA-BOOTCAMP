package STRIVER_SHEET.ARRAYS;

import java.util.ArrayList;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, -1},
                {-10,5,11},
                {18, -7, 6},
        };

        int[][] ans = transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }


    public ArrayList<ArrayList<Integer>> transpose1(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
            ans.add(row);
        }

        return ans;
    }



}
