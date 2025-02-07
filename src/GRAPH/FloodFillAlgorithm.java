package GRAPH;

// leetcode


public class FloodFillAlgorithm {

    private void dfs(int row, int col, int[][] ans, int[][] image, int newColor, int[] delRow, int[] delCol, int iniColor) {
        // color with new color
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        // there are exactly 4 neighbours
        for(int i = 0;i<4;i++) {
            int neighbourRow = row + delRow[i];
            int neighbourCol = col + delCol[i];
            // check for valid coordinate 
            // then check for same initial color and unvisited pixel
            if(neighbourRow>=0 && neighbourRow<n && neighbourCol>=0 && neighbourCol < m &&
                    image[neighbourRow][neighbourCol] == iniColor && ans[neighbourRow][neighbourCol] != newColor) {
                dfs(neighbourRow, neighbourCol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // get initial color
        int iniColor = image[sr][sc];
        int[][] ans = image;
        // delta row and delta column for neighbours
        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};
        dfs(sr, sc, ans, image, newColor, delRow, delCol, iniColor);
        return ans;
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
