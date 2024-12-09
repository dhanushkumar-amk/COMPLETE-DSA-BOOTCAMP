package SEARCHING;

public class WoodCuttingProblem {
    public static void main(String[] args) {
        int[] height = {20,15,10,17};
        int targetWood = 7;
        System.out.println(machines(height, targetWood));

    }
    static  int machines(int[] height, int targetWood){

        // find maximum value
        int max = 0;
        for (int i = 0; i < height.length ; i++) {
            if (height[i] > max)
                max =height[i];
        }

    }
}
