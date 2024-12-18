package ARRAYS;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElements2(arr));
    }

    static int majorityElements1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count  = 1;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j])
                    count ++;

            }
            if (count > arr.length /2)
                return arr[i];
        }
        return -1;
    }

    //efficient solution
    static int majorityElements2(int[] arr){

        int maj = arr[0];
        int count = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == maj)
                count++;
            else
                count--;


            if (count == 0){
                maj = arr[i];
                count = 1;
            }
        }

        return maj;
    }

}
