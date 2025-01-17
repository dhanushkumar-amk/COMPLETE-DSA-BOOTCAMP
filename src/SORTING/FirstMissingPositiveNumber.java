package SORTING;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {

    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                int temp =arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }

        

    }
}