package ARRAYS;

public class LeadersOfAnArray {
    public static void main(String[] args) {
    int[] arr = {8,11,5,11,7,6,3};
    leaders1(arr);
    }


    // brute force
    static void leaders1(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] > arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                System.out.println(arr[i] + " ");
        }
    }
}
