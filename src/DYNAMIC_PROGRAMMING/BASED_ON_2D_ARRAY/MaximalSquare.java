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


        public int maximalSquare(char[][] mat) {
            int ans=0;
            int dp[][]=new int[mat.length][mat[0].length];

            // first row i == 0; i == 1;

            for(int i=0;i<mat.length;i++){
                if(mat[i][0]=='1'){
                    dp[i][0]=1;
                    ans=1;
                }
            }
            for(int i=0;i<mat[0].length;i++){
                if(mat[0][i]=='1'){
                    dp[0][i]=1;
                    ans=1;
                }
            }
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(mat[i][j]=='1'){
                        dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                        ans=Math.max(ans,dp[i][j]);
                    }
                }
            }
            return ans*ans;
        }
    }

