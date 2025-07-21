package STRIVER_SHEET.ARRAYS;


public class MaximumConsecutiveIOnes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,1,1,1,5,6,7,1,1};
        System.out.println(maximumCons(arr));
    }

    static int maximumCons(int[] arr){
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }else
                count = 0;
        }
        return maxCount;
    }

}
