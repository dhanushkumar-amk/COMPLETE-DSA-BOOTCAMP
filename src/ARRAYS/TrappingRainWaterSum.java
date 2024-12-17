package ARRAYS;

public class TrappingRainWaterSum {
    public static void main(String[] args) {
    int[] height = {4,2,0,3,2,5};
    trap(height);
    }

    static void trap(int[] height){
        int maxmin = Math.min(height[0] , height[height.length - 1]);
        System.out.println(maxmin);
    }
}
