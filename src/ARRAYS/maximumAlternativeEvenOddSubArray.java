package ARRAYS;

public class maximumAlternativeEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {8,10,11,12};
        System.out.println(evenOdd(arr));
    }


    static int evenOdd(int[] arr){
        int maxCount = 0;
        for (int i = 0; i < arr.length ; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] % 2 == 0 && arr[j - 1]%2  != 0   || arr[j]%2 != 0 && arr[j-1] %2 == 0)
                    count++;
                else
                    break;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
