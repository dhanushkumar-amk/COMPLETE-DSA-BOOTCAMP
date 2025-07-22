package STRIVER_SHEET.ARRAYS;

public class FindTheNumberThatAppearsOnceAndTheOtherNumbersTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
        System.out.println(getSingleElement(arr));
    }

    public static int getSingleElement(int[] arr){

        int xor = 0;
        for (int i = 0; i < arr.length; ++i) {
            xor = xor ^ arr[i];
        }
        return xor;
    }


}