package ARRAYS;

public class TrappingRainWaterSum {
    public static void main(String[] args) {
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    trap(height);
    }

    static void trap(int[] height){
        int maxmin = Math.min(height[0] , height[height.length - 1]);

        int result = 0;
        for (int i = 1; i <height.length -1; i++) {
            result +=  maxmin - height[i];
        }
        System.out.println(result);
    }
}
