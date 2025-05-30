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
        int row = matrix.length;
        int column  = matrix[0].length;

        int[][] dp = new int[row][column];

        int maxSum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if(matrix[i][j] == '1'){

                    // special case for first row and column when it is an value 1
                    if(i == 0 || j == 0)
                        dp[i][j] = '1';
                    else
//                        find the min valueof the neighbour and add + 1
                        dp[i][j] = Math.min(dp[i -1][j], Math.min(matrix[i - 1][j - 1], matrix[i][j - 1])) + 1;
                }
                maxSum = Math.max(maxSum, dp[i][j]);
            }
        }
        return maxSum;
    }
}
