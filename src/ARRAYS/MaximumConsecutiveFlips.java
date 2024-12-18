package ARRAYS;

public class MaximumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,0,0,0,1,1,};
        maximumFlips(arr);
    }

    static void maximumFlips(int[] arr){

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[i-1]){
                if (arr[i] != arr[0])
                    System.out.print(i + " ");
                else
                    System.out.print(i - 1);
            }
 }
    }
}
