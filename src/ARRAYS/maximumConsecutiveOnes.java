package ARRAYS;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {0,1,1,0,0,1,1,1,0};
        System.out.println(consec1(arr));
    }
    static int consec1(int[] arr){
        int maxCount = 0;

        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j]== 1)
                    count++;
                else
                    break;
            }

            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
