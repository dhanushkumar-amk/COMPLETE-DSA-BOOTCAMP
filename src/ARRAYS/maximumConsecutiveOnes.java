package ARRAYS;

public class maximumConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {0,1,1,0,0,1,1,1,0};
        System.out.println(consec2(arr));
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


    // efficient solution

    static int consec2(int[] arr){
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 0)
                count =0;
            else {
                count++;
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
