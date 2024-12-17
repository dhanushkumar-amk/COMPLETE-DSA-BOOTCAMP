package ARRAYS;

public class TrappingRainWaterSum {
    public static void main(String[] args) {
    int[] height = {4,2,0,3,2,5};
        System.out.println(trap2(height));

    }

    static int trap1(int[] height){

        int result = 0;
        for (int i = 1; i <= height.length - 2; i++) {

            int leftBorder = height[i];
            for (int j = 0; j < i; j++) {
                if (height[j] > leftBorder)
                    leftBorder = height[j];
            }

            int rightBorder = height[i];
            for (int j = i + 1; j < height.length ; j++) {
                if (height[j] > rightBorder)
                    rightBorder = height[j];
            }

            int waterLevel = Math.min(leftBorder, rightBorder);
            int trapWater  = waterLevel - height[i];
            result += trapWater;
        }
        return result;
    }

    static int trap2(int[] height){
        int res = 0;
        int[] lb = new int[height.length];
        int[] rb = new int[height.length];

        lb[0] = height[0];
        for (int i = 1; i < height.length - 1; i++) {
          lb[i] = Math.max(height[i], lb[i - 1]);
        }

        rb[0] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
          rb[i] = Math.max(height[i], lb[i + 1]);
        }

        for (int i = 1; i < height.length -1 ; i++) {
            res += Math.min(lb[i],rb[i]) - height[i];
        }

        return res;
    }

}
