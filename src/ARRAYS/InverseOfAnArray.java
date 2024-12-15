package ARRAYS;

public class InverseOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,0,4};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int[] answer = inverse(arr);

        for (int i = 0; i < answer.length ; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    static int[] inverse(int[] arr){

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int value = arr[i];
            ans[value] = i;
        }
        return ans;
    }
}


