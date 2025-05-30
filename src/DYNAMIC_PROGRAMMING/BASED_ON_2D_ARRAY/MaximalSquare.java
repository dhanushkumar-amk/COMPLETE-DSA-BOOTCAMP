package DYNAMIC_PROGRAMMING.BASED_ON_2D_ARRAY;


// leetcode : 221
// https://leetcode.com/problems/maximal-square/description/

public class MaximalSquare {
    public static void main(String[] args) {
        MaximalSquare answer = new MaximalSquare();
        char[][] matrix = {
                {'1','0','1','0', '0'},
                {'1','0','1','1', '1'},
                {'1','1','1','1', '1'},
                {'1','0','0','1', '0'},
        };

        System.out.println(answer.maximalSquare(matrix));
    }

    public int maximalSquare(char[][] matrix) {

    }
}
