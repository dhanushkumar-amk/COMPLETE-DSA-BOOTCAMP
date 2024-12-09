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

        int low = 0;
        int high = max;
        int mid = 0;

        while(low <= high){
            mid = (low + high)/2;
            int woodPiece = findWoodCount(height, mid);

            if (woodPiece == targetWood || low == mid)
                return mid;
            else if (woodPiece > targetWood)
                low = mid;
            else
                high  =mid;
        }
        return -1;
    }

    static  int findWoodCount(int[] height, int mid){
        int woodCount = 0;

        for (int i = 0; i < height.length ; i++) {
            if(height[i] > mid){
                woodCount += (height[i] - mid);
            }
        }
        return woodCount;
    }

}
