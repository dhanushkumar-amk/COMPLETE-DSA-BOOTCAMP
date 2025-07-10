package STRIVER_SHEET.MATHS;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(12350));
    }

    public static int reverse(int n){
        int ans = 0;

        while(n != 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }

}
