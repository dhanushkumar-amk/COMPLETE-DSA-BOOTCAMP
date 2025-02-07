package GRAPH;

public class FloodFillAlgorithm {

    public int[][]  floodFill(int[][] image, int startRow, int startCol, int newColor){
        int initialColor = image[startRow][startCol];

        int[][] answerMatrix = image;

        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, -1, 0, 1};


        dfs(startRow, startCol, answerMatrix, image, newColor, deltaRow, deltaCol, initialColor);
        return answerMatrix;
    }

    private void dfs(int startRow, int startCol, int[][] answerMatrix, int[][] image, int newColor, int[] deltaRow, int[] deltaCol, int initialColor) {

        answerMatrix[startRow][startCol] = newColor;

        int n = image.length;
        int m = image[0].length;

        // because for 4 => direction
        for (int i = 0; i < 4; i++) {
            int neighbourRow = startRow + deltaRow[i];
            int neighbourCol = startCol + deltaCol[i];

            if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && image[neighbourRow][neighbourCol] == initialColor && answerMatrix[neighbourRow][neighbourCol] != newColor)
                dfs(startRow, startCol, answerMatrix, image, newColor, deltaRow, deltaCol, initialColor);
        }
    }


    public static void main(String[] args)
    {
        int[][] image =  {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        // sr = 1, sc = 1, newColor = 2
        FloodFillAlgorithm obj = new FloodFillAlgorithm();
        int[][] ans = obj.floodFill(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }

}
