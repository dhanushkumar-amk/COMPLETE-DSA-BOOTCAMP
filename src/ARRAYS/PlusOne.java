package ARRAYS;

public class PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        String val = sb.toString();
        int valOne = Integer.parseInt(val);

        int ans = valOne + 1;

        int[] arr = new int[100];
        int index = 0;
        while (ans > 0){
            int lastVal = ans % 10;
            arr[index] = lastVal;
            ans /= 10;
            index++;
        }
        return arr;

    }

}
