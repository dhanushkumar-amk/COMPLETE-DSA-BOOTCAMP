package MATRIX;

//leetcode 2570
// https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/?envType=daily-question&envId=2025-03-02

public class MergeTwo2DArraysBySummingValues {

    public static void main(String[] args) {
        MergeTwo2DArraysBySummingValues solution = new MergeTwo2DArraysBySummingValues();

        int[][] num1 = {
                {1,2},
                {2,3},
                {4,5},
        };

        int[][] num2 = {
                {1,4},
                {3,2},
                {4,1},
        };

        int[][] answer = solution.mergeArrays(num1, num2);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[][] answer = new int[n][m];

        int i = 0;
        int j = 0;

        while(i < n && j < m){
            
        }

    }
}
