package STRIVER_SHEET.ARRAYS;

public class MajorityElementsNByTwoTimes {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElements(arr));
    }

    static int majorityElements(int[] arr){
        int count = 0;
        int element = 0;

        for (int i = 0; i < arr.length; ++i) {
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(arr[i] == element)
                count++;
            else
                count--;
        }

        int counter1 = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == element)
                counter1++;
        }
        if(counter1 > arr.length / 2)
            return element;
        return -1;
    }
}
