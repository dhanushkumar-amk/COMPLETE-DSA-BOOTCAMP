package ARRAYS;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {3,1,3};
        System.out.println(majorityElements1(arr));
    }

    static int majorityElements1(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count  = 0;
            for (int j = i+ 1; j < arr.length ; j++) {

                if (arr[i] == arr[j])
                    count++;
            }
            if (count > arr.length /2)
                return arr[i];
        }
        return -1;
    }
}
