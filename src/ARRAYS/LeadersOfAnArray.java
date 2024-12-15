package ARRAYS;

public class LeadersOfAnArray {
    public static void main(String[] args) {
    int[] arr = {8,11,5,11,7,6,3};
    leaders2(arr);
    }


    // brute force
    static void leaders1(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] >= arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if (isLeader)
                System.out.print(arr[i] + " ");
        }
    }

    // efficient solution
    static  void leaders2(int[] arr){
        int currentLeader = arr.length -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currentLeader){
                currentLeader = arr[i];
                System.out.print(currentLeader + " ");
            }
        }
    }
}
