package ARRAYS;

public class FrequencyOfAnArray {
    public static void main(String[] args) {
    int[] arr = {20,20,30,30,30,30, 40};
    frequency(arr);
    }

    static void frequency(int[] arr){
    int frequency = 1;
    int i = 1; // starts from second variable

        while (i < arr.length){
            while (i < arr.length && arr[i] == arr[i -1]){
                frequency++;
                i++;
            }

            System.out.println(arr[i -1] + " " + frequency);
            frequency = 1;
            i++;
        }

        if ( arr.length == 1  || arr[i - 1] != arr[i - 2])
            System.out.println(arr[i - 1] + " " + frequency);
    }
}
